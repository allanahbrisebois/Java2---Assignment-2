/**
 * Name:Allanah Brisebois
 * Program: Computer System Technology: SDNE
 * Class: PROG24178
 * Assignment: 2
 * @author Allanah Brisebois
 */

package allanah_brisebois_a2;

public class CommisionEmployee extends Employee {
    private double rate; //Commission rate
    private double sales; //$ of sales
    
    //Commission Employeee constructor 
    public CommisionEmployee(int id, String firstName, String lastName, double rate, double sales) {
        super(id, firstName, lastName); //superclass Employee
        this.rate = rate;
        this.sales = sales;
    }
    //Rate getter
    public double getRate() {
        return rate;
    }
    //Sales getter
    public double getSales() {
        return sales;
    }
    
    //Calculate pay based on commission formula
    @Override
    public double calculatePay(){
        return (sales * rate)/100;
    }
    
    //Displays Commission Employee Information
    @Override
    public String toString(){
        return String.format("Employee %d: %s, %s \nCommission Rate:  %.2f \nSales: $ %.2f  \n", id, lastName, firstName, rate, sales);   
    }
    
    //Displays Weekly Pay of Commission Employee
    @Override
    public String displayInfo(){
         return String.format("Weekly pay for %s, %s employee ID: %d is $ %.2f", lastName, firstName, id, calculatePay());
    }
}