package kz.lesson13.miner.gui;

import kz.lesson13.miner.ICell;

import java.awt.*;

/**
 * Ячейка через графич. интерфейс
 */
public class GUICell implements ICell<Graphics> {
    private boolean bomb;
    public static int x;
    public static int y;
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

    @Override
    public void draw(Graphics paint, boolean real) {
        /*if (real) {
            if (this.isBomb()) {
               *//**
                * paint.print("[*] "); paint.drawOval(5, 5, 40, 40);
                *//*
                paint.drawOval(5, 5, 10, 10);
            } else {
                *//**
                 * paint.print("[ ] "); paint.drawOval(55, 55, 30, 40);
                 *//*
                paint.drawOval(5, 5, 10, 10);
            }
        } else {
            if (this.suggestBomb) {
                *//**
                 * paint.print("[?] "); paint.drawOval(55, 5, 20, 40);
                 *//*
                paint.drawOval(5, 5, 30, 30);
            } else if (this.suggestEmpty) {
                *//**
                 * paint.print("[ ] "); paint.drawOval(55, 55, 30, 40);
                 * *//*
                paint.drawOval(5, 5, 10, 10);
            } else {
                *//**
                 * paint.print("[X] "); paint.drawOval(5, 55, 10, 40);
                 *//*
                //paint.drawOval(5, 55, 40, 40);
            }
        }*/
    }

    public void drawGraphics(Graphics paint, int x, int y, boolean real) {
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
