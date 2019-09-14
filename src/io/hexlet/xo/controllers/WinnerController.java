package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.Point;

public class WinnerController {
    public Figure getWinner(Field field){

        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();

        for (int i = 0; i < field.getSize(); i++) {
            p1.setX(0);
            p2.setX(1);
            p3.setX(2);

            p1.setY(i);
            p2.setY(i);
            p3.setY(i);

            if (field.getFigure(p1) != null
                    && field.getFigure(p2) != null
                    && field.getFigure(p3) != null
                    && field.getFigure(p1).equals(field.getFigure(p2))
                    && field.getFigure(p1).equals(field.getFigure(p3))) {

                return field.getFigure(p1);
            }
        }

        for (int i = 0; i < field.getSize(); i++) {
            p1.setX(i);
            p2.setX(i);
            p3.setX(i);

            p1.setY(0);
            p2.setY(1);
            p3.setY(2);

            if (field.getFigure(p1) != null
                    && field.getFigure(p2) != null
                    && field.getFigure(p3) != null
                    && field.getFigure(p1).equals(field.getFigure(p2))
                    && field.getFigure(p1).equals(field.getFigure(p3))) {

                return field.getFigure(p1);
            }
        }

        {
            p1.setX(0);
            p2.setX(1);
            p3.setX(2);

            p1.setY(0);
            p2.setY(1);
            p3.setY(2);

            if (field.getFigure(p1) != null
                    && field.getFigure(p2) != null
                    && field.getFigure(p3) != null
                    && field.getFigure(p1).equals(field.getFigure(p2))
                    && field.getFigure(p1).equals(field.getFigure(p3))) {

                return field.getFigure(p1);
            }
        }

        {
            p1.setX(2);
            p2.setX(1);
            p3.setX(0);

            p1.setY(0);
            p2.setY(1);
            p3.setY(2);

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