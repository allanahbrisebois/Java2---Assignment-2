/**
 * Name:Allanah Brisebois
 * Program: Computer System Technology: SDNE
 * Class: PROG24178
 * Assignment: 2
 *
 * @author Allanah Brisebois
 */
package allanah_brisebois_a2;

public abstract class Employee {

    int id; //employee ID
    String firstName; //employee first name
    String lastName; //employee last name

    //Employee Constructor
    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Id getter
    public int getId() {
        return id;
    }

    //Id setter
    public void setId(int id) {
        this.id = id;
    }

    //First name getter
    public String getFirstName() {
        return firstName;
    }

    //First name setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Last name getter
    public String getLastName() {
        return lastName;
    }

    //Last name setter 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    // clacluates pay for the employees  
    public double calculatePay() {
        return 0.00;
    }
    
    //toString method
    @Override
    public String toString() {
        return "1";
    }
    
    //Displays Weekly Pay of Commission Employee
    public String displayInfo() {
        return String.format("Weekly pay for %s, %s employee ID: %d is $ %.2f", lastName, firstName, id, calculatePay());
    }
}
