/**
 * Name:Allanah Brisebois
 * Program: Computer System Technology: SDNE
 * Class: PROG24178
 * Assignment: 2
 *
 * @author Allanah Brisebois
 */
package allanah_brisebois_a2;

public class SalaryEmployee extends Employee {

    private double salary; //employee salary

    //Salary Employeee constructor 
    public SalaryEmployee(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName); //superclass Employee
        this.salary = salary;
    }

    //Salary getter
    public double getSalary() {
        return salary;
    }

    //Calculate pay based on salary formula
    @Override
    public double calculatePay() {
        return salary / 52;
    }

    //Displays Salary Employee Information
    @Override
    public String toString() {
        return String.format("Employee %d: %s, %s \nSalary: $ %.2f \n", id, lastName, firstName, salary);
    }

    //Displays Weekly Pay of Commission Employee
    @Override
    public String displayInfo() {
        return String.format("Weekly pay for %s, %s employee ID: %d is $ %.2f", lastName, firstName, id, calculatePay());
    }
}
