package kz.lesson13.miner;

/**
 * Логика игры
 */
public interface ISaperLogic {

    /**
     * Логика заполнения поля
     * @param cells заполеное поле
     */
    void loadBoard(ICell[][] cells);

    boolean shouldBang(int x, int y);

    boolean finish();

    void suggest(int x, int y, boolean bomb);
}
