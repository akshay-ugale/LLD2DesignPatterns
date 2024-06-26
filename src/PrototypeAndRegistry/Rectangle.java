package PrototypeAndRegistry;

public class Rectangle extends Shape{
    public int width;
    public int height;

    public Rectangle() {
    }
    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.height = rectangle.height;
        this.width = rectangle.width;
    }

    @Override
    public Rectangle Clone(){
        return new Rectangle(this);
    }
}
