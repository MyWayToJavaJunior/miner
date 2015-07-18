package kz.lesson13.miner.gui;

import kz.lesson13.miner.BasicAction;
import kz.lesson13.miner.IGeneratorBoard;
import kz.lesson13.miner.ISaperLogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * graphic action
 */
public class GUIAction extends BasicAction implements ActionListener, MouseListener {
    private GUIBoard board;

    public GUIAction(ISaperLogic logic, GUIBoard board, IGeneratorBoard generator) {
        super(logic, board, generator);
        this.board = board;
        this.board.addMouseListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        initGame();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        select(e.getX() < 50 ? 0 : 1, e.getY() < 50 ? 0 : 1, e.getButton() != 1);
        board.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
