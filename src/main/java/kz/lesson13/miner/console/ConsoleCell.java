package kz.lesson13.miner.console;

import kz.lesson13.miner.ICell;

import java.io.PrintStream;

/**
 * консольная ячейка
 */
public class ConsoleCell implements ICell<PrintStream> {

    private  boolean bomb;
    private boolean suggestBomb = false;
    private boolean suggestEmpty = false;

    public ConsoleCell(boolean bomb) {
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
    public void draw(PrintStream paint, boolean real) {
        if (real) {
            if (this.isBomb()) {
                paint.print("[*] ");
            } else {
                paint.print("[ ] ");
            }
        } else {
            if (this.suggestBomb) {
                paint.print("[?] ");
            } else if (this.suggestEmpty) {
                paint.print("[ ] ");
            } else {
                paint.print("[X] ");
            }
        }
    }

}
