//3.    Write a program by creating an 'Employee' class having the following methods and print the final salary.
//a.    'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
//b.    'AddSal()' which adds $10 to salary of the employee if it is less than $500.
//c.    'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.

package JavaAssignments;

import java.util.Scanner;

public class Assignment3 {
	private double sal;
	private int workPerDay;

	public Assignment3(double sal, int workPerDay) {
		super();
		this.sal = sal;
		this.workPerDay = workPerDay;
	}

	void getInfo() {
		System.out.println("Salary of the Employee: " + sal);
		System.out.println("Working hours per day of the Employee: " + workPerDay);
	}

	void AddSal() {
		if (sal < 500)
			sal += 10;
		System.out.println("Salary of the Employee: " + sal);
	}

	void addWork() {
		if (workPerDay > 6)
			sal += 5;
		System.out.println("Salary of the Employee: " + sal);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sal and hours");
		double sal = sc.nextDouble();
		int hours = sc.nextInt();

		Assignment3 a3 = new Assignment3(sal, hours);
		a3.getInfo();
		System.out
				.println("==========================================================================================");
		System.out.println("adds $10 to salary of the employee if it is less than $500");
		a3.AddSal();
		System.out
				.println("==========================================================================================");
		System.out.println("adds $5 to salary of employee if the number of hours of work per day is more than 6 hours");
		a3.addWork();

	}

}
