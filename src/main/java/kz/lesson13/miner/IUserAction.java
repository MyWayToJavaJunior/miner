package kz.lesson13.miner;

/**
 * �������� ������������
 */
public interface IUserAction {

    /**
     * ��������� ����
     */
    void initGame();

    /**
     * ������� ������
     * @param x �����. �� �����
     * @param y �����. �� ����
     * @param bomb ���� true ������� ��� �����
     */
    void select(int x, int y, boolean bomb);
}
