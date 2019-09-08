package io.hexlet.xo.model;

import io.hexlet.xo.controllers.CurrentMoveController;
import io.hexlet.xo.controllers.MoveController;
import io.hexlet.xo.controllers.WinnerController;

public class Game {
    Player player1;
    Player player2;
    Field field;
    String name;
    CurrentMoveController currentMoveController;
    MoveController moveController;
    WinnerController winnerController;
}
