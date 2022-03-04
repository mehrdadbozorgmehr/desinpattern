package ir.com.sample.designpattern.simple.factory;

/**
 * Created by Mehrdad on 03/04/2022.
 */
public class Triangle extends Shape {

    public Triangle(Double radius, String name) {
        super(radius, name);
    }

    @Override
    Double getPerimeter() {
        return 3.0 * radius;
    }

    @Override
    Double getArea() {
        return Math.sqrt(3.0)*Math.pow(radius,2)/8.0;
    }
}
