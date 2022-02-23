package ir.com.sample.designpattern.decorator;

/**
 * Created by Mehrdad on 02/23/2022.
 */
public class Manager implements Employee {
    public float calculateSalary(long base, long hours) {
        return base*2*hours;
    }
}
