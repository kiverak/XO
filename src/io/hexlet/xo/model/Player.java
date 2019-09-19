package io.hexlet.xo.model;

public class Player {
    private final String name;
    private final Figure figure;

    private Player(final PlayerBuilder playerBuilder) {
        this.name = playerBuilder.getName();
        this.figure = playerBuilder.getFigure();
    }

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return figure;
    }

    //Builder
    public class PlayerBuilder {
        private String name;
        private Figure figure;

        public playerBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public playerBuilder figure(final Figure figure) {
            this.figure = figure;
            return this;
        }

        public String getName() {
            return name;
        }

        public Figure getFigure() {
            return figure;
        }

        public Player build() {
            return new Player(this);
        }
    }
}
