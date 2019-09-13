package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;

public class CurrentMoveController {

    public String currentMove(Field field) {
        int numOfX = 0;
        int numOfO = 0;
        Point p = new Point(0, 0);
        for (int i = 0; i < field.getSize(); i++)
            for (int j = 0; j < field.getSize(); j++) {
                p.setX(i);
                p.setY(j);
                if (field.getFigure(p) == "X") numOfX++;
                if (field.getFigure(p) == "O") numOfO++;
            }
        if (numOfX == numOfO) return "X";
        else return "O";
    }
}