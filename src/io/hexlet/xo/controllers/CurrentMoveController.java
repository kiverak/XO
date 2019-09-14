package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.Point;

import static io.hexlet.xo.model.Figure.O;
import static io.hexlet.xo.model.Figure.X;

public class CurrentMoveController {

    public Figure currentMove(Field field) {
        int numOfX = 0;
        int numOfO = 0;
        Point p = new Point(0, 0);
        for (int i = 0; i < field.getSize(); i++)
            for (int j = 0; j < field.getSize(); j++) {
                p.setX(i);
                p.setY(j);
                if (field.getFigure(p) == X) numOfX++;
                if (field.getFigure(p) == O) numOfO++;
            }
        if (numOfX == numOfO) return X;
        else return O;
    }
}