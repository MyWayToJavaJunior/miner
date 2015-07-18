package kz.lesson13.miner;


import kz.lesson13.miner.gui.GUIAction;
import kz.lesson13.miner.gui.GUIBoard;
import kz.lesson13.miner.gui.GUICell;
import kz.lesson13.miner.logics.Easy;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * точка входа и создание основного фрейма
 */
public class Main {
    private static final JPanel controlPanel = new JPanel();
    private static final GUIBoard board = new GUIBoard();
    public static JLabel label;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                final JFrame frame = new JFrame();
                frame.setTitle("Sapper");
                frame.setLayout(new BorderLayout());
                frame.setSize(500, 500);
                frame.add(board, BorderLayout.CENTER);
                board.setBorder(new EmptyBorder(10, 10, 10, 10));
                frame.add(controlPanel, BorderLayout.PAGE_END);
                label = new JLabel("push Start");
                frame.add(label, BorderLayout.BEFORE_FIRST_LINE);
                controlPanel.setLayout(new FlowLayout());
                final JButton generate = new JButton("Start");
                generate.addActionListener(
                        new GUIAction (
                        new Easy(), board,
                        new IGeneratorBoard() {
                            @Override
                            public ICell[][] generate() {
                                return new ICell[][] {{new GUICell(true), new GUICell(false)}, {new GUICell(true), new GUICell(false)}};
                            }
                        }
                ));
                controlPanel.add(generate);
                centre(frame);
                frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                frame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        closePerform(frame);
                    }
                });
                frame.setVisible(true);
            }
        });
    }

    public static void centre(Window w) {
        Dimension us = w.getSize();
        Dimension them = Toolkit.getDefaultToolkit().getScreenSize();
        int newX = (them.width - us.width) / 2;
        int newY = (them.height - us.height) / 2;
        w.setLocation(newX, newY);
    }

    public static void closePerform(JFrame frame) {
        frame.setVisible(true);
        frame.dispose();
        System.exit(0);
    }

    public static void setLabel(String textOnLabel) {
        label.setText(textOnLabel);
        label.repaint();
    }

}
