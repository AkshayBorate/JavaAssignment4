//5.    Write a program that has variables to store Car data like; CarModel, CarName, CarPrice
//        and CarOwner. The program should include functions to assign user defined values
//        to the above mentioned variable and a
//        display function to show the values. Write a main that calls these functions.
//        Now write another runner class that declares three Car objects and displays the data of all three.

package JavaAssignments;

import java.util.Scanner;

public class Assignment5 {
    private String CarModel;
    private String CarName;
    private String CarOwner;
    Scanner sc= new Scanner(System.in);
    public void AssignValues(){
        System.out.println("Enter the carmodel");
        CarModel=sc.next();
        System.out.println("Enter the carname");
        CarName = sc.next();
        System.out.println("Enter the carowner");
        CarOwner=sc.next();

    }
    public void getValues(){
        System.out.println("Car model: "+CarModel+"\nCar Name: "+CarName+"\nCarOwner: "+CarOwner);
    }
    public static void main(String[] args) {
        Assignment5 a5 = new Assignment5();
        Assignment5 a51 = new Assignment5();
        Assignment5 a52 = new Assignment5();

        System.out.println("Enter details for car 1");
        a5.AssignValues();
        System.out.println("Enter details for car 2");
        a51.AssignValues();
        System.out.println("Enter details for car 3");
        a52.AssignValues();
        System.out.println("===================================");

        a5.getValues();
        System.out.println("===================================");
        a51.getValues();
        System.out.println("===================================");
        a52.getValues();

    }
}
