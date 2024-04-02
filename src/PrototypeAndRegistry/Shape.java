package PrototypeAndRegistry;

public class Shape {

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    protected Shape(Shape shape) {
        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    public Shape Clone()
    {
        return new Shape(this);
    }
}
