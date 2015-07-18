package kz.lesson13.miner;


/**
 * Ячейка, проверка состояния,
 * изменение состояния,
 * прорисовка
 */
public interface ICell<T> {

    /**
     * Проверка состояния
     * содежржит ли ячейка бомбу
     * @return true если ячейка сожержит
     * бомбу
     */
    boolean isBomb();

    /**
     * Проверка состояния
     * на пометку бомба
     * @return true если помечена
     * как бомба
     */
    boolean isSuggestBomb();

    /**
     * Проверка состояния
     * на пометку пустая ячейка
     * @return true если помечена
     * как бомба
     */
    boolean isSuggestEmpty();

    /**
     * установка состояния
     * ячейка помечена
     * как содержащая бомбу
     */
    void suggectBomb();

    /**
     * установка состояния
     * ячейка помечена
     * как пустая
     */
    void suggectEmpty();

    /**
     * Прорисовка ячейки
     * @param paint метод прорисовки
     * @param real настоящая доска или логическая
     */
    void draw(T paint, boolean real);

    /**
     * Прорисовка ячейки в GUI
     * @param graphics
     * @param x номер ячейки по x
     * @param y номер ячейки по y
     * @param real открытая доска или нет
     */
    void draw(T graphics, int x, int y, boolean real);
}
