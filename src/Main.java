public class Main {
    public static void main(String... args) {
        final Point p = new Point();
        p.x = 2;
        p.y = 3;

        final Player player = new Player();
        player.name = "Slava";
        player.figure = "X";

        final Game game = new Game();
        game.player1 = new Player();
        game.player2 = new Player();
        game.name = "XO";
        game.field = new Field();

        final Field field = new Field();
        field.f00 = "X";
        field.f01 = "X";
        field.f02 = "X";

        field.f10 = "X";
        field.f11 = "X";
        field.f12 = "X";

        field.f20 = "X";
        field.f21 = "X";
        field.f22 = "X";
    }
}
