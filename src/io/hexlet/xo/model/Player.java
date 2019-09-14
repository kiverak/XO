package io.hexlet.xo.model;

public class Player {
    private final String name;
    private final Figure figure;
    String address;
    int score;
    String nick;
    String uuid;

    public Player(String name, Figure figure) {
        this.name = name;
        this.figure = figure;
    }

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return figure;
    }
}
