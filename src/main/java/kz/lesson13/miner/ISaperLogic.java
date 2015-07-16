package kz.lesson13.miner;

/**
 * ������ ����
 */
public interface ISaperLogic {

    /**
     * ������ ���������� ����
     * @param cells ��������� ����
     */
    void loadBoard(ICell[][] cells);

    boolean shouldBang(int x, int y);

    boolean finish();

    void suggest(int x, int y, boolean bomb);
}
