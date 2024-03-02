package abstrato.entitie;

import abstrato.entities.enums.Color;

public abstract class Shape {

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public abstract double area();
}
