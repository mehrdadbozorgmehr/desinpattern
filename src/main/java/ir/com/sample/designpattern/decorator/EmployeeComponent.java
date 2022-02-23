package ir.com.sample.designpattern.decorator;

/**
 * Created by Mehrdad on 02/23/2022.
 */
public abstract class EmployeeComponent implements Employee{
    protected Employee decoratedEmployee;

    public EmployeeComponent(Employee decoratedEmployee){
        this.decoratedEmployee = decoratedEmployee;
    }

    public float calculateSalary(long base, long hours) {
        return decoratedEmployee.calculateSalary(base,hours);
    }

}
