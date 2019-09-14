package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.Point;

public class MoveController {
    public boolean applyFigure(Field field, Point point, Figure figure){
        if(point.getX() == -1 || point.getY() == -1) return false;
        else if (!checkFigureIsEmpty(field, point)) return false;
        else field.setFigure(point, figure);
        return true;
    }

    public boolean checkFigureIsEmpty(Field field, Point point){
        if (field.getFigure(point) != null) return false;
        return true;
    }
}