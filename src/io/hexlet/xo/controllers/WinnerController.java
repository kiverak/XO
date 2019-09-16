package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.Point;

public class WinnerController {

    public Figure getWinner(final Field field) {
        for (int i = 0; i < field.getSize(); i++) {
            Point p1 = new Point(0, i);
            Point p2 = new Point(1, i);
            Point p3 = new Point(2, i);

            if (field.getFigure(p1) != null
                    && field.getFigure(p2) != null
                    && field.getFigure(p3) != null
                    && field.getFigure(p1).equals(field.getFigure(p2))
                    && field.getFigure(p1).equals(field.getFigure(p3))) {

                return field.getFigure(p1);
            }
        }

        for (int i = 0; i < field.getSize(); i++) {
            Point p1 = new Point(i, 1);
            Point p2 = new Point(i, 1);
            Point p3 = new Point(i, 2);

            if (field.getFigure(p1) != null
                    && field.getFigure(p2) != null
                    && field.getFigure(p3) != null
                    && field.getFigure(p1).equals(field.getFigure(p2))
                    && field.getFigure(p1).equals(field.getFigure(p3))) {

                return field.getFigure(p1);
            }
        }

        {
            Point p1 = new Point(0, 0);
            Point p2 = new Point(1, 1);
            Point p3 = new Point(2, 2);

            if (field.getFigure(p1) != null
                    && field.getFigure(p2) != null
                    && field.getFigure(p3) != null
                    && field.getFigure(p1).equals(field.getFigure(p2))
                    && field.getFigure(p1).equals(field.getFigure(p3))) {

                return field.getFigure(p1);
            }
        }

        {
            Point p1 = new Point(2, 0);
            Point p2 = new Point(1, 1);
            Point p3 = new Point(0, 2);

            if (field.getFigure(p1) != null
                    && field.getFigure(p2) != null
                    && field.getFigure(p3) != null
                    && field.getFigure(p1).equals(field.getFigure(p2))
                    && field.getFigure(p1).equals(field.getFigure(p3))) {

                return field.getFigure(p1);
            }
        }
        return null;
    }
}