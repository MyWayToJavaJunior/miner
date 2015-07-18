package kz.lesson13.miner.gui;

import kz.lesson13.miner.IBoard;
import kz.lesson13.miner.ICell;

import javax.swing.*;
import java.awt.*;

/**
 * graphics board
 */
public class GUIBoard extends JPanel implements IBoard {

    public static final int PADDING = 50;

    public boolean real = false;

    public ICell<Graphics>[][] cells;

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        if (this.cells != null) {
            for (int x = 0; x != cells.length; x++) {
                for (int y = 0; y != cells[0].length; y++) {
                    graphics.setColor(Color.black);
                    cells[x][y].draw(graphics, x, y, real);
                    graphics.drawRect(x * PADDING, y * PADDING, PADDING, PADDING);
                }

            }
        }
    }

    @Override
    public void drawBoard(ICell[][] cells) {
        this.cells = cells;
        real = false;
        this.repaint();
    }

    @Override
    public void drawCell(int x, int y) {
        this.repaint();
    }

    @Override
    public void drawBang() {
        real = true;
        this.repaint();
    }

    @Override
    public void drawCongratulate() {
        real = true;
        this.repaint();
    }


}
