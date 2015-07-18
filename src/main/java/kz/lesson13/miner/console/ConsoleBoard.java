package kz.lesson13.miner.console;

import kz.lesson13.miner.IBoard;
import kz.lesson13.miner.ICell;

/**
 * Доска с выводом в консоль
 */
public class ConsoleBoard implements IBoard {

    private ICell[][] cells;

    @Override
    public void drawBoard(ICell[][] cells) {
        this.cells = cells;
        this.redraw(false);
    }

    @Override
    public void drawCell(int x, int y) {
        System.out.println("******** Select *********");
        this.redraw(false);
    }

    @Override
    public void drawBang() {
        System.out.println("******* Bang *******");
        this.redraw(true);
    }

    @Override
    public void drawCongratulate() {
        System.out.println("****** Congratulate ******");
    }

    private void redraw(boolean real) {
        for (ICell[] row : cells) {
            for (ICell cell : row) {
                cell.draw(System.out, real);
            }
            System.out.println();
        }
        System.out.println();
    }

}
