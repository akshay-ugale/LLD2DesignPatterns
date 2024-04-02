package PrototypeAndRegistry;


public class PrototypeAndRegistry {

    static ShapeRegistry InsertIntoShapeRegistry(){
        ShapeRegistry registry = new ShapeRegistry();

        Shape shapeProto1 = new Shape();
        shapeProto1.x = 4;
        shapeProto1.y = 7;
        shapeProto1.color = "Red";
        registry.add(ShapeEnum.Shape.getShape(), shapeProto1);

        Circle CircleProto1 = new Circle();
        CircleProto1.x = 14;
        CircleProto1.y = 17;
        CircleProto1.color = "Green";
        CircleProto1.radius = 15;
        registry.add(ShapeEnum.Circle.getShape(),  CircleProto1);

        Rectangle RectProto1 = new Rectangle();
        RectProto1.x = 14;
        RectProto1.y = 17;
        RectProto1.color = "Green";
        RectProto1.width = 15;
        RectProto1.height = 15;
        registry.add(ShapeEnum.Rectangle.getShape(), RectProto1);

        return  registry;
    }
    public static void ProtoDemo() {

        var registry = InsertIntoShapeRegistry();
        Shape shapeProto1 = registry.get(ShapeEnum.Shape.getShape());
        Shape copyOne = shapeProto1.Clone();

        System.out.println(shapeProto1);
        System.out.println(copyOne);

        Circle CircleProto1 = (Circle)registry.get(ShapeEnum.Circle.getShape());
        Circle copyTwo = CircleProto1.Clone();

        System.out.println(CircleProto1);
        System.out.println(copyTwo);


        Rectangle RectProto1 = (Rectangle) registry.get(ShapeEnum.Rectangle.getShape());
        Rectangle copyThree = RectProto1.Clone();

        System.out.println(RectProto1);
        System.out.println(copyThree);

    }

}
