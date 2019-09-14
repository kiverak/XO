package io.hexlet.xo.model;

public class Field {
    private final Figure[][] figures = new Figure[3][3];
    private final int size;

    public Field(int size) { this.size = size; }

    public int getSize(){
        return figures.length;
    };

    public Figure getFigure(final Point point){
        return figures[point.getX()][point.getY()];
    }

    public Figure getFigure(int x, int y){
        return figures[x][y];
    }

    public void setFigure (Point point, Figure figure) {
        figures[point.getX()][point.getY()] = figure;
    }
}
