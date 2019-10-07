package io.hexlet.xo.view;

import io.hexlet.xo.controllers.Game;
import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.Point;

public class ConsoleView implements ICoordinateGetter{

    private Game game;
    private final StringBuilder fieldBuilder = new StringBuilder();

    public ConsoleView() {}

    public ConsoleView(Game game) {
        this.game = game;
    }

    @Override
    public Point getMoveCoordinate(final Field field) {
        return new Point(0, 0);
    }

    public void show(final Game game) {
        final Field field = game.getField();

        for (int a = 0; a < field.getSize(); a++) {
            if (a != 0)
                generateSeparator(fieldBuilder);
            generateLine(field, a, fieldBuilder);
        }
        System.out.println(fieldBuilder.toString());
    }

    void generateLine(final Field field,
                      final int c,
                      final StringBuilder sb) {
        for (int i = 0; i < field.getSize(); i++) {
            Point p = new Point(c, i);
            sb.append(" ");
            if (field.getFigure(p) == null || field.getFigure(p).toString().equals(" "))
                sb.append(" ");
            if (field.getFigure(p) == Figure.X)
                sb.append("X");
            if (field.getFigure(p) == Figure.O)
                sb.append("O");
            if (i != field.getSize() - 1)
                sb.append(" |");
            else sb.append(" \n");
        }
    }

    void generateSeparator(final StringBuilder sb) { sb.append("~~~~~~~~~~~\n"); }

    public StringBuilder getFieldBuilder() {
        return fieldBuilder;
    }
}
