package PrototypeAndRegistry;

public class Circle extends Shape {

    public int radius;

    public Circle() {
    }

    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    @Override
    public Circle Clone(){
        return new Circle(this);
    }

}
