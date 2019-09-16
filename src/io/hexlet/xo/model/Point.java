package io.hexlet.xo.model;

public class Point {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
}
