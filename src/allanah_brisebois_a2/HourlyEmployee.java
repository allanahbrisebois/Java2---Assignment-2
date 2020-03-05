/**
 * Name:Allanah Brisebois
 * Program: Computer System Technology: SDNE
 * Class: PROG24178
 * Assignment: 2
 * @author Allanah Brisebois
 */

package allanah_brisebois_a2;


public class HourlyEmployee extends Employee {

    private double numHours; //number of hours the employee worked
    private double hourlyRate; // hourly wage
    
    //Hourly Employeee constructor 
    public HourlyEmployee(int id, String firstName, String lastName, double numHours, double hourlyRate) {
        super(id, firstName, lastName);
        this.numHours = numHours;
        this.hourlyRate = hourlyRate;
    }
    //Number of Hours getter
    public double getNumHours() {
        return numHours;
    }
    //Hourly Rate getter
    public double getHourlyRate() {
        return hourlyRate;
    }
    //Calculate pay based on hourly formula
    @Override
    public double calculatePay(){
        return numHours * hourlyRate;
    }
     //Displays Salary Employee Information
    @Override
    public String toString(){
        return String.format("Employee %d: %s, %s \nSalary: $ %.2f \n", id, lastName, firstName, hourlyRate);
    }
    //Displays Weekly Pay of Commission Employee
    @Override
    public String displayInfo(){
        return String.format("Weekly pay for %s, %s employee ID: %d is $ %.2f", lastName, firstName, id, calculatePay());
    }
    
}