import io.hexlet.xo.model.*;
import io.hexlet.xo.view.*;
import io.hexlet.xo.controllers.*;

public class Main {

    public static void main(String... args) {
        final Game game = new Game();
        final ConsoleView consoleView = new ConsoleView(game);
        startGame(consoleView);
    }

    private static void startGame(final ConsoleView consoleView) {
        consoleView.showGameName();
    }
}
