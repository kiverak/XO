package io.hexlet.xo.view;

import io.hexlet.xo.controllers.Game;
import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Player;
import io.hexlet.xo.model.Point;

public class ConsoleView {

    private Game game;

    public ConsoleView() {}

    public ConsoleView(Game game) {
        this.game = game;
    }



    public void showGameName () {
        System.out.println(game.getGameName());
    }

    public void showPlayersName () {
        System.out.println(game.getPlayers());
    }

    public boolean move (Game game){
        return false;
    }

    public String show(Field field) {
        Point point = new Point();
        for (int i = 0; i < field.getSize(); i++) {
            for (int j = 0; j < field.getSize(); j++) {
                point.setX(i);
                point.setY(j);
                System.out.print(field.getFigure(point));
                if (field.getFigure(point) == null) System.out.print(" ");
                if(j != field.getSize() - 1) System.out.print("|");
            }
            System.out.println();
        }
        return null;
    }
}


//public class ConsoleView {
//
//    private static final String LINE_CHARACTER = "~";
//
//    protected final GameController gameController;
//
//    // BEGIN (write your solution here)
//    public ConsoleView (GameController gameController) {
//        this.gameController = gameController;
//    }
//    // END
//
//    public void start() {
//        System.out.println("Please input coordinates: ");
//        int x = getCoordinate("X");
//        int y = getCoordinate("Y");
//
//    }
//
//    public void showGameName() {
//        System.out.println(gameController.getGameName());
//    }
//
//    public void showPlayersName() {
//
//        Arrays.stream(gameController.getPlayers())
//                .map(Player::getName)
//                .forEach(System.out::println);
//
//    }
//
//    void showLine(final int size) {
//        for (int i = 0; i < size; i = i + 1) {
//            System.out.print(LINE_CHARACTER);
//        }
//        System.out.println();
//    }
//
//    private int getCoordinate(final String coordinateName) {
//        int counter = 0;
//        do {
//            System.out.print(String.format("Input the coordinate %s: ", coordinateName));
//            try {
//                final Scanner in = new Scanner(System.in);
//                return in.nextInt();
//            } catch (final InputMismatchException e) {
//                System.out.println("Coordinate is incorrect");
//                counter += 1; // counter = counter + 1;
//            }
//        } while(counter < 3);
//        return -1;
//    }
//
//    public GameController getGameController() {
//        return gameController;
//    }
//}