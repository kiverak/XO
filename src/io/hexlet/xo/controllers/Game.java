package io.hexlet.xo.model;

import io.hexlet.xo.controllers.CurrentMoveController;
import io.hexlet.xo.controllers.MoveController;
import io.hexlet.xo.controllers.WinnerController;

public class Game {
    private static final String GAME_NAME;

    static { GAME_NAME = "XO"; }

    private Player[] players;
    private Field field;
    CurrentMoveController currentMoveController;
    MoveController moveController;
    WinnerController winnerController;

    public void printGameName () { System.out.println(Game.GAME_NAME); }

    public void showGameName() {}

    public Player currentPlayer(){
        return null;
    }

    public boolean move (int x, int y) {
        return false;
    }
}
