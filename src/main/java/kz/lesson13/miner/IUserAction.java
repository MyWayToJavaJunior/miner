package kz.lesson13.miner;

/**
 * Действия пользователя
 */
public interface IUserAction {

    /**
     * Запустить игру
     */
    void initGame();

    /**
     * выбрать ячейку
     * @param x коорд. по гориз
     * @param y коорд. по верт
     * @param bomb если true выбрана как бомба
     */
    void select(int x, int y, boolean bomb);
}
