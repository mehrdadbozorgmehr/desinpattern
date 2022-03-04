package ir.com.sample.designpattern.simple.factory;

/**
 * Created by Mehrdad on 03/04/2022.
 */
public abstract class Shape {
    protected Double radius;
    String name;
    abstract Double getPerimeter();
    abstract Double getArea();

    public Shape(Double radius,String name) {
        this.radius = radius;
        this.name = name;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shape is " + name + ". and its Perimeter is " + getPerimeter() + " and its Area is " + getArea();
    }
}
