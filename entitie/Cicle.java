package abstrato.entitie;

import abstrato.entities.enums.Color;

public class Cicle extends Shape{

    private Double radius;

    public Cicle(){
    }
    public Cicle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
