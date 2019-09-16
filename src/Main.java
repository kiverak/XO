import io.hexlet.xo.model.*;
import io.hexlet.xo.model.Point;
import io.hexlet.xo.view.*;
import io.hexlet.xo.controllers.*;

import static io.hexlet.xo.model.Figure.O;
import static io.hexlet.xo.model.Figure.X;

public class Main {

    public static void main(String... args) {
        final Field field = new Field();
        final CurrentMoveController cmc = new CurrentMoveController();
        ConsoleView print = new ConsoleView();
        WinnerController wc = new WinnerController();

        final Point p = new Point(1, 1);

        if (!cmc.currentMove(field).equals(X)) {
            throw new RuntimeException("do not returns X when the field is empty");
        }

        for (int i = 0; i < field.getSize(); i++)
            for (int i2 = 0; i2 < field.getSize(); i2++) {
                p.setX(i);
                p.setY(i2);
                final Figure figure = ((i * 3 + i2) % 2 == 0 ? X : O);
                field.setFigure(p, figure);
                //System.out.printf("putting figure: %s to the: X:%d Y:%d\n", figure, p.x, p.y);
                if (cmc.currentMove(field).equals(figure)) {
                    throw new RuntimeException(String.format("returns %s for the field: \n%s", figure, print.show(field)));
                }
            }

        print.show(field);
        System.out.println("The winner is " + wc.getWinner(field));
    }
}
