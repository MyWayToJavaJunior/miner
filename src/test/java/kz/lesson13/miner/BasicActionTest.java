package kz.lesson13.miner;

import kz.lesson13.miner.console.ConsoleBoard;
import kz.lesson13.miner.console.ConsoleCell;
import kz.lesson13.miner.logics.Easy;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Тест по основным действиям
 */
public class BasicActionTest {

    /*final BasicAction action = new BasicAction(
            new Easy(), new ConsoleBoard(), new IGeneratorBoard() {
                @Override
                public ICell[][] generate() {
                    return new ICell[][] {
                        {new ConsoleCell(true), new ConsoleCell(false)},
                        {new ConsoleCell(true), new ConsoleCell(false)}};
                }
            }
    );

    @Test
    public void successGame() {
        action.initGame();
        action.select(0, 0, true);
        action.select(1, 0, true);
        action.select(0, 1, false);
        action.select(1, 1, false);
    }

    @Test
    public void failureGame() {
        action.initGame();
        action.select(0, 0, true);
        action.select(1, 0, false);
    }*/
}