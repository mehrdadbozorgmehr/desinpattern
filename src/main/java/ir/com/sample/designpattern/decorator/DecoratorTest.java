package ir.com.sample.designpattern.decorator;

/**
 * Created by Mehrdad on 02/23/2022.
 */
public class DecoratorTest {
    public static void main(String[] args) {

        Employee employee = new Manager();
        System.out.println(employee.calculateSalary(5000,100));


        Employee employee2 = new TaxCalculatorDecorator(new Manager());
        System.out.println(employee2.calculateSalary(5000,100));

        employee= new TaxCalculatorDecorator(employee);
        System.out.println(employee);



    }
}
