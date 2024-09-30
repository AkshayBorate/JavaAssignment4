//7.    Create a SavingsAccount class. Use a static data member annual Interest Rate to store the annual interest rate for each of the savers. Each member of the class contains a private data member
//        savingsBalance indicating the amount the saver currently has on deposit. Provide member function calculateMonthlyInterest() that calculates the monthlyinterest by multiplying the balance by annualInterestRate
//        divided by 12; this interest should be added to savingsBalance. Provide a static member function modifyInterestRate() that sets the static annualInterestRate to a new value. Write a driver program to
//        test class SavingsAccount. Instantiate two different objects of classSavingsAccount, saver1 and saver2, with balances of
//        2000.00 and 3000.00,respectively. Set the annualInterestRate to
//        3 percent. Then calculate the monthlyinterest and print the new balances for each of the savers. Then set
//        The annualInterestRate to 4 percent, calculate the next month's interest and print the new balances for each of the savers.


package JavaAssignments;

public class Assignment7 {
    private double savingBalance;
    private static double annualInterestRate;
    private double intAmount;

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    public void calculateMonthlyInterest() {
        intAmount = (savingBalance * (annualInterestRate/100)) / 12;
        savingBalance += intAmount;
        System.out.println("Monthly interest: " + intAmount);
        System.out.println("New balance after adding interest: " + savingBalance);
    }

    public static void main(String[] args) {
        Assignment7 a7 = new Assignment7();
        Assignment7 a71 = new Assignment7();
        a7.setSavingBalance(2000.00);
        a71.setSavingBalance(3000.00);

        Assignment7.modifyInterestRate(3);

        System.out.println("intereset when is 3");
       a7.calculateMonthlyInterest();
        System.out.println("\nintereset when is 3");
       a71.calculateMonthlyInterest();
        System.out.println("=====================================================");
        Assignment7.modifyInterestRate(4);
        System.out.println(" After modifying ");
        a7.calculateMonthlyInterest();
       a71.calculateMonthlyInterest();
    }
}
