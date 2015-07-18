package kz.lesson13.miner.logics;

import kz.lesson13.miner.ICell;
import kz.lesson13.miner.ISaperLogic;

/**
 * Вариант сложности логики игры
 */
public class Easy implements ISaperLogic{
    private ICell[][] cells;


    @Override
    public void loadBoard(ICell[][] cells) {
        this.cells = cells;
    }

    @Override
    public boolean shouldBang(int x, int y) {
        final ICell selected = this.cells[x][y];
        return selected.isBomb() && !selected.isSuggestBomb();
    }

    @Override
    public boolean finish() {
        boolean finish = false;
        for (ICell[] row: cells) {
            for (ICell cell : row) {
                finish = ((cell.isSuggestBomb() && cell.isBomb()) ||
                          (cell.isSuggestEmpty() && !cell.isBomb()));
            }
        }
        return finish;
    }

    @Override
    public void suggest(int x, int y, boolean bomb) {
        if (bomb) {
            this.cells[x][y].suggectBomb();
        } else {
            this.cells[x][y].suggectEmpty();
        }
    }
}
