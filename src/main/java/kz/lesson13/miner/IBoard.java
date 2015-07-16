package kz.lesson13.miner;

/**
 * ��������� ��������� �����
 */
public interface IBoard {

    /**
     * ������ ����� ������ �� ��������� ������ �����.
     * @param cells ������ �����
     */
    void drawBoard(ICell[][] cells);

    /**
     * ������ ������
     * @param x ������� ������ �� �����������
     * @param y ������� ���� �� ���������
     */
    void drawCell(int x, int y);

    /**
     * ������ ����� ���� ����
     */
    void drawBang();

    /**
     * ������ ������������ ����� ���� ��������
     */
    void drawCongratulate();
}
