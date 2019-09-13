package io.hexlet.xo.model;

public class Field {
    private String[][] figures = new String[3][3];

    public int getSize(){
        return figures.length;
    };

    public String getFigure(final Point point){
        return figures[point.getX()][point.getY()];
    }

    public void setFigure (Point point, String figure) {
        figures[point.getX()][point.getY()] = figure;
    }
}
