package ir.com.sample.designpattern.simple.factory;

/**
 * Created by Mehrdad on 03/04/2022.
 */
public class ShapeFactory {
    public Shape getShape(String shapeType,Double radius){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle(radius,shapeType);

        } else if(shapeType.equalsIgnoreCase("TRIANGLE")){
            return new Triangle(radius,shapeType);

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square(radius,shapeType);
        }
        return null;
    }
}
