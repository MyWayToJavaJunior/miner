package kz.lesson13.miner.gui;

import kz.lesson13.miner.ICell;

import java.awt.*;

/**
 * graphics cell
 */
public class GUICell implements ICell<Graphics> {
    private boolean bomb;
    private boolean suggestBomb = false;
    private boolean suggestEmpty = false;

    public GUICell(boolean bomb) {
        this.bomb = bomb;
    }

    @Override
    public boolean isBomb() {
        return this.bomb;
    }

    @Override
    public boolean isSuggestBomb() {
        return this.suggestBomb;
    }

    @Override
    public boolean isSuggestEmpty() {
        return this.suggestEmpty;
    }

    @Override
    public void suggectBomb() {
        this.suggestBomb = true;
    }

    @Override
    public void suggectEmpty() {
        this.suggestEmpty = true;
    }

    /**
     * Use drawGraphics
     * @param paint метод прорисовки
     * @param real ?
     */
    @Override
    public void draw(Graphics paint, boolean real) {

    }

    public void draw(Graphics paint, int x, int y, boolean real) {
        x = x < 1 ? 25 : 75;
        y = y < 1 ? 25 : 75;
        if (real) {
            if (this.isBomb()) {
                paint.drawString("*", x, y);
            } else {
                paint.drawString("-", x, y);
            }
        } else {
            if (this.suggestBomb) {
                paint.drawString("?", x, y);
            } else if (this.suggestEmpty) {
                paint.drawString("-", x, y);
            } else {
                paint.drawString("X", x, y);
            }
        }
    }
}
