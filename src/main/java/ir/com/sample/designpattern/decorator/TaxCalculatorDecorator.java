package ir.com.sample.designpattern.decorator;

/**
 * Created by Mehrdad on 02/23/2022.
 */
public class TaxCalculatorDecorator extends EmployeeComponent {
    public TaxCalculatorDecorator(Employee decoratedEmployee) {
        super(decoratedEmployee);
    }

    @Override
    public float calculateSalary(long base, long hours) {
        float salary = decoratedEmployee.calculateSalary(base,hours);
        return salary-calculateTax(salary);
    }

    private float calculateTax(float salary){
        return (float) (salary * 0.05);
    }
}
