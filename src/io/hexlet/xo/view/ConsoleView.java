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