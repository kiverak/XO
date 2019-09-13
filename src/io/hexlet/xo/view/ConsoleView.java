package io.hexlet.xo.view;

import io.hexlet.xo.controllers.Game;
import io.hexlet.xo.model.Player;

public class ConsoleView {

    private Game game;

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
}