package kz.lesson13.miner;

import java.awt.*;

/**
 * ������, �������� ���������,
 * ��������� ���������,
 * ����������
 */
public interface ICell<T> {

    /**
     * �������� ���������
     * ��������� �� ������ �����
     * @return true ���� ������ ��������
     * �����
     */
    boolean isBomb();

    /**
     * �������� ���������
     * �� ������� �����
     * @return true ���� ��������
     * ��� �����
     */
    boolean isSuggestBomb();

    /**
     * �������� ���������
     * �� ������� ������ ������
     * @return true ���� ��������
     * ��� �����
     */
    boolean isSuggestEmpty();

    /**
     * ��������� ���������
     * ������ ��������
     * ��� ���������� �����
     */
    void suggectBomb();

    /**
     * ��������� ���������
     * ������ ��������
     * ��� ������
     */
    void suggectEmpty();

    /**
     * ���������� ������
     * @param paint ����� ����������
     * @param real ?
     */
    void draw(T paint, boolean real);

    void drawGraphics(T graphics, int x, int y, boolean b);
}
