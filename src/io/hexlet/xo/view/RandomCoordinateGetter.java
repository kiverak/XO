package io.hexlet.xo.view;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import io.hexlet.xo.model.Point;

import java.util.Random;

public class RandomCoordinateGetter implements ICoordinateGetter {

    @Override
    public Point getMoveCoordinate(Field field) {
        boolean getted = false;
        Point randomPoint = null;
        while (!getted) {
            Random random = new Random();
            Point point = new Point(random.nextInt(field.getSize()), random.nextInt(field.getSize()));
            if (field.getFigure(point) != Figure.X && field.getFigure(point) != Figure.O) {
                getted = true;
                randomPoint = point;
            }
        }
        return randomPoint;
    }
}
