package kz.lesson13.miner;

/**
 * интрефейс для модуля действий
 */
public interface IUserAction {

    /**
     * инициализация доски
     */
    void initGame();

    /**
     * действия над ячейкой
     * @param x
     * @param y
     * @param bomb открываем или помечаем
     * как бомбу
     */
    void select(int x, int y, boolean bomb);
}
