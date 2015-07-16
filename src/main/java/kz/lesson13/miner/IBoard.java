package kz.lesson13.miner;

/**
 * ќписывает поведение доски
 */
public interface IBoard {

    /**
     * –исует доску исход€ из вход€щего масива €чеек.
     * @param cells ћассив €чеек
     */
    void drawBoard(ICell[][] cells);

    /**
     * –исует €чейку
     * @param x позици€ €чейки по горизонтали
     * @param y позици€ ейки по вертикали
     */
    void drawCell(int x, int y);

    /**
     * –исует взрыв всех бомб
     */
    void drawBang();

    /**
     * –исует поздравлени€ когда игра выйграна
     */
    void drawCongratulate();
}
