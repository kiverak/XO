package io.hexlet.xo.model;

public class Field {
    private final Figure[][] figures = new Figure[3][3];

    public int getSize(){
        return figures.length;
    };

    public Figure[][] getFigures() {
        return figures;
    }

    public Figure getFigure(final Point point){
        return figures[point.getX()][point.getY()];
    }

    public Figure getFigure(final int x, final int y){
        return figures[x][y];
    }

    public void setFigure (final Point point, final Figure figure) {
        this.figures[point.getX()][point.getY()] = figure;
    }
}
