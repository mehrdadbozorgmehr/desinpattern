package ir.com.sample.designpattern.smipleFactory;

/**
 * Created by Mehrdad on 03/04/2022.
 */
public class ShapeFactoryTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle
        Shape circle = shapeFactory.getShape("CIRCLE",2.0);
        //get circle speciofication
        System.out.println(circle.toString());

        //get an object of Square
        Shape square = shapeFactory.getShape("SQUARE",2.0);
        //get square speciofication
        System.out.println(square.toString());

        //get an object of Triangle
        Shape triangle = shapeFactory.getShape("TRIANGLE",2.0);
        //get triangle speciofication
        System.out.println(triangle.toString());

    }
}
