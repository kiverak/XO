package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Player;

public class Game {
    private static final String GAME_NAME;

    static { GAME_NAME = "XO"; }

    private Player[] players;
    public Field field;
    public CurrentMoveController currentMoveController;
    MoveController moveController;
    WinnerController winnerController;

    public static String getGameName() {
        return GAME_NAME;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void showGameName() {}

    public Player currentPlayer(){
        return null;
    }

    public boolean move (int x, int y) {
        return false;
    }
}
