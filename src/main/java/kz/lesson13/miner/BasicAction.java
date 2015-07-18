package kz.lesson13.miner;

/**
 * Основные действия над доской
 */
public class BasicAction implements IUserAction{
    private final IGeneratorBoard generator;
    private final IBoard board;
    private final ISaperLogic logic;

    public BasicAction(final ISaperLogic logic, final IBoard board, final IGeneratorBoard generator) {
        this.generator = generator;
        this.board = board;
        this.logic = logic;
    }

    @Override
    public void initGame() {
        final ICell[][] cells = generator.generate();
        this.board.drawBoard(cells);
        this.logic.loadBoard(cells);
        Main.setLabel("game started!");
    }

    @Override
    public void select(int x, int y, boolean bomb) {
        this.logic.suggest(x, y, bomb);
        board.drawCell(x, y);
        if (this.logic.shouldBang(x, y)) {
            this.board.drawBang();
            Main.setLabel("you lose!");
        }
        if (this.logic.finish()) {
            board.drawCongratulate();
            Main.setLabel("you win!");
        }
    }
}
