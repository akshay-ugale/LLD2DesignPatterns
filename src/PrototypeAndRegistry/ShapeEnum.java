package PrototypeAndRegistry;

public enum ShapeEnum {
    Shape, Circle, Rectangle;

   public String getShape(){
       return switch (this) {
           case Shape -> "Shape";
           case Circle -> "Circle";
           case Rectangle -> "Rectangle";
       };
   }
}
