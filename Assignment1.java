//1.    Write a program to print the area and perimeter of a
//triangle having sides of 3, 4 and 5 units by creating a
//class named 'Triangle' with parameter in its constructor.

package JavaAssignments;

public class Assignment1 {
	private int side1;
	private int side2;
	private int side3;
	

	public Assignment1(int side1, int side2, int side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
   
    void area() {
    	int s = (side1+side2+side3)/2;
    	int s1 = s-side1;
    	int s2=s-side2;
    	int s3=s-side3;
    	int sq = s*(s1*s2*s3);
    	double Area = (int) Math.sqrt(sq);
    	System.out.println("Area of triangle is : "+Area);
    }
    void perimeter() {
    	int result = side1+side2+side3;
       System.out.println("Perimeter of triangle is : "+result);
    }

	public static void main(String[] args) {
		Assignment1 a1  = new Assignment1(3,4,5);
		a1.area();
		a1.perimeter();

	}

}
