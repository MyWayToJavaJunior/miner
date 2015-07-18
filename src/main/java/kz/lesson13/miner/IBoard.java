package kz.lesson13.miner;

/**
 * Описывает поведение доски
 */
public interface IBoard {

    /**
     * Рисует доску исходя из входящего масива ячеек.
     * @param cells Массив ячеек
     */
    void drawBoard(ICell[][] cells);

    /**
     * Рисует ячейку
     * @param x позиция ячейки по горизонтали
     * @param y позиция ейки по вертикали
     */
    void drawCell(int x, int y);

    /**
     * Рисует взрыв всех бомб
     */
    void drawBang();

    /**
     * Рисует поздравления когда игра выйграна
     */
    void drawCongratulate();
}
