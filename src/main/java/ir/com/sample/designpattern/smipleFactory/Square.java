package ir.com.sample.designpattern.smipleFactory;

/**
 * Created by Mehrdad on 03/04/2022.
 */
public class Square extends Shape {

    public Square(Double radius, String name) {
        super(radius, name);
    }

    @Override
    Double getPerimeter() {
        return 4.0 * radius;
    }

    @Override
    Double getArea() {
        return radius * radius;
    }
}
