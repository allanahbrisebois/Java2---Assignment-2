/**
 * Name:Allanah Brisebois
 * Program: Computer System Technology: SDNE
 * Class: PROG24178
 * Assignment: 2
 * @author Allanah Brisebois
 */
package allanah_brisebois_a2;

import java.util.Scanner;
import java.util.ArrayList;

public class Allanah_Brisebois_A2 {

    public static void main(String[] args) {
        
        int numEmployees; //number of total employees 
        //array list of all employees
        ArrayList<Employee> employees = new ArrayList<>();
        //scanner input
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        //ask how many employees the user wants to enter
        System.out.print("How many employees do you want to create? ");
        numEmployees = input.nextInt();

       //for loop to ask for type of employee and employee information 
        for (int i = 1; i <= numEmployees; i++) {
            System.out.println("Employee data for employee " + i + " of " + numEmployees);

            System.out.println("Choose the type of employee to add. \n 1. Salaried \n 2. Hourly \n 3. Commission");
          
            int typeEmployee = input.nextInt(); //type of employee to add

                switch (typeEmployee) {
                    //Salary type employee
                    case 1:
                        //Ask for employee information 
                        System.out.print("Employee ID: ");
                        int id = checkId(employees); //salary employee id

                        System.out.print("First Name: ");
                        String firstName = sc.nextLine(); //salary employee first name

                        System.out.print("Last Name: ");
                        String lastName = sc.nextLine(); //salary employee last name

                        System.out.print("Salary: ");
                        int salary = input.nextInt(); // salary 
                        //add to salary employees
                        Employee employee = new SalaryEmployee(id, firstName, lastName, salary);

                        employees.add(employee);

                        break;

                    case 2:
                        //Hourly type employee
                        //Ask for employee information
                        System.out.print("Employee ID: ");
                        int id2 = checkId(employees); // hourly employee id

                        System.out.print("First Name: ");
                        String firstName2 = sc.nextLine(); //hourly employee first name

                        System.out.print("Last Name: ");
                        String lastName2 = sc.nextLine(); //hourly employee last name

                        System.out.print("Hours Worked: ");
                        double numHours = input.nextDouble(); // number of hours worked

                        System.out.print("Hourly Rate: ");
                        double hourlyRate = input.nextDouble(); //hourly wage
                        //add to hourly employees
                        employee = new HourlyEmployee(id2, firstName2, lastName2, numHours, hourlyRate);

                        employees.add(employee);

                        break;

                    case 3:
                        //Commission type employee
                        //Ask for employee information
                        System.out.print("Employee ID: ");
                        int id3 = checkId(employees); //commission employee id

                        System.out.print("First Name: ");
                        String firstName3 = sc.nextLine(); //commission employee first name

                        System.out.print("Last Name: ");
                        String lastName3 = sc.nextLine(); //commission employee last name

                        System.out.print("Commission Rate: ");
                        double rate = input.nextDouble(); //commission rate

                        System.out.print("Sales: ");
                        double sales = input.nextDouble(); //sales
                        //add to commission employees 
                        employee = new CommisionEmployee(id3, firstName3, lastName3, rate, sales);
                        employees.add(employee);

                        break;
                    //If user enters an employee type of anything other then 1-3
                    default:
                        System.out.println("Please enter valid employee type");
                        break;
                }
            }
        
        //loop to ask for report type until user enters 3 to exit
        do {
            System.out.println("Choose a report. \n 1. Employee listing \n 2. Payroll listing \n 3. Exit");

            int report = input.nextInt();
            switch (report) {
                //displays list of employees and their information
                case 1:
                    System.out.println(employees.toString().substring(1,employees.toString().length() - 1));
                    break;
                //displays payroll for employees
                case 2:
                    for (int i = 0; i < employees.size(); i++) {
                        System.out.println(employees.get(i).displayInfo());
                    }
                    break;
                //exits loop
                case 3:
                    System.exit(0);
                //invalid menu input
                default:
                    System.out.println("Enter a valid report type or 3 to exit");
                    break;

            }
        } while (true);
    }

    //method to check that employee ID's are unique
    public static int checkId(ArrayList<Employee> list) {
        Scanner in = new Scanner(System.in);
        int employeeId = in.nextInt();
        for (Employee e : list) { //searches through each employee on arraylist
            if (employeeId == e.getId()) { //checks to see if the current entered id matches previous id's already in arraylist
                System.out.print("That id is already taken: ");
                employeeId = checkId(list);
            }
        }
        return employeeId; // returns checked employeeId 
    }
}
