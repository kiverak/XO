package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Player;
import io.hexlet.xo.model.Figure;

import java.util.function.Function;
import java.util.stream.IntStream;

public class Game {

    private static final String DEFAULT_GAME_NAME = "XO";
    private static final Field DEFAULT_FIELD = new Field(3);
    private static final Player[] DEFAULT_PLAYERS = {new Player("Player1", Figure.X),
                                                    new Player("Player2", Figure.O)};

    private final String gameName;
    private final Player[] players;
    private final Field field;

    private CurrentMoveController currentMoveController;
    private MoveController moveController;
    private WinnerController winnerController;

    public Game() {
        this(DEFAULT_GAME_NAME, DEFAULT_PLAYERS, DEFAULT_FIELD);
    }

    public Game (String gameName, Player[] players, Field field) {
        if(gameName != null && gameName != "") this.gameName = gameName;
        else this.gameName = DEFAULT_GAME_NAME;
        if(players != null) this.players = players;
        else this.players = DEFAULT_PLAYERS;
        if(field != null) this.field = field;
        else this.field = DEFAULT_FIELD;
    }

    public Player currentPlayer() {
        final Function<String, Integer> countCalculator = (figure) ->
                IntStream.range(0, 3)
                        .map(row -> (int) IntStream.range(0, 3).filter(column -> field.getFigure(row, column) != null && field.getFigure(row, column).getFigure().equals(figure) ).count() )
                        .sum();
        final int countX = countCalculator.apply("X");
        final int countO = countCalculator.apply("O");
        final boolean xMove = countX == countO;
        if (players[0].getFigure().getFigure().equals("X")) {
            if (xMove)
                return players[0];
            else
                return players[1];
        } else {
            if (xMove)
                return players[1];
            else
                return players[0];
        }
    }

    public Player winner() {
        for (int i=0; i<3; i++) {
            if (field.getFigure(i, 0) == field.getFigure(i, 1) &&
                    field.getFigure(i, 0) == field.getFigure(i, 2)) {
                if (players[0].getFigure() == field.getFigure(i, 0)) return players[0];
                return players[1];
            }
        }
        for (int i=0; i<3; i++) {
            if (field.getFigure(0, i) == field.getFigure(1, i) &&
                    field.getFigure(0, i) == field.getFigure(2, i)) {
                if (players[0].getFigure() == field.getFigure(0, i)) return players[0];
                return players[1];
            }
        }
        if (field.getFigure(0, 0) == field.getFigure(1, 1) &&
                field.getFigure(0, 0) == field.getFigure(2, 2)) {
            if (players[0].getFigure() == field.getFigure(1, 1)) return players[0];
            return players[1];
        }
        if (field.getFigure(0, 2) == field.getFigure(1, 1) &&
                field.getFigure(0, 2) == field.getFigure(2, 0)) {
            if (players[0].getFigure() == field.getFigure(1, 1)) return players[0];
            return players[1];
        }
        return null;
    }

    public String getGameName() {
        return this.gameName;
    }

    public Field getBoard() {
        return field;
    }

    public Player[] getPlayers() {
        return players;
    }

    public Player[] getDefaultPlayers() {
        return DEFAULT_PLAYERS;
    }

    public String getDefaultGameName() {
        return DEFAULT_GAME_NAME;
    }

//    public boolean move (int x, int y) {
//        return false;
//    }
}
