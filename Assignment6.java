
//6.    Write a class Time with three data members to store hr, min and seconds.
//        Create two constructors and apply checks to set valid time.
//        (hr<24, min<60, sec<60). Also create display function which displays all data members.

package JavaAssignments;

public class Assignment6 {
    private int hours;
    private int min;
    private int sec;

    public Assignment6(int hours,int min,int sec) {
        this.hours=hours;
        this.min = min;
        this.sec=sec;
    }
    void check(){
        if(hours>24)
            System.out.println("Enter valid hours: ");

        if(min>60)
            System.out.println("Enter valid minutes: ");
        if(sec>60)
            System.out.println("Enter valid seconds: ");
    }
    public void display(){
        System.out.println("Time in hrs:min:sec  :: "+hours+":"+min+":"+sec);
    }

    public static void main(String[] args) {
        Assignment6 a6 = new Assignment6(15,4,64);
        a6.check();
        a6.display();
    }
}
