package ir.com.sample.designpattern.smipleFactory;

/**
 * Created by Mehrdad on 03/04/2022.
 */
public class Circle extends Shape {
    public Circle(Double radius, String name) {
        super(radius, name);
    }

    @Override
    public Double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
}
