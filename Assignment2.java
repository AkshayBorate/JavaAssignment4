//2.Print the sum, difference and product of two complex numbers by 
//creating a class, named 'Complex' with separate methods for each operation whose real 
//and imaginary parts are entered by user. Use Constructors to initialize the data members.

package JavaAssignments;

import java.util.Scanner;

public class Assignment2 {
	private int real;
	private int imag;
	private int real2;
	private int imag2;

	public Assignment2(int real, int imag, int real2, int imag2) {
		super();
		this.real = real;
		this.imag = imag;
		this.real2 = real2;
		this.imag2 = imag2;
	}

	void sum() {
		int r1 = real + real2;
		int r2 = imag + imag2;
		System.out.println("Sum of complex no is : " + r1 + " + " + r2 + "i");
	}

	void diff() {
		int r1 = real - real2;
		int r2 = imag - imag2;
		System.out.println("Difference of complex no is : " + r1 + " + " + r2 + "i");
	}

	void product() {
		int r1 = real * real2;
		int r2 = imag * imag2;
		int r3 = real * imag2;
		int r4 = imag * real2;
		int result1 = r1 - r2;
		int result2 = r3 - r4;
		System.out.println("product of complex no is : " + result1 + " + " + result2 + "i");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter real and imag no");
		int real = sc.nextInt();
		int imag = sc.nextInt();
		System.out.println("Enter real and imag no");
		int real2 = sc.nextInt();
		int imag2 = sc.nextInt();

		Assignment2 a2 = new Assignment2(real, imag, real2, imag2);
		a2.sum();
		a2.diff();
		a2.product();
	}

}
