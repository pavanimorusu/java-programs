public class SavingsAccount {
    private double savingsBalance;
    private static double annualInterestRate;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() {
        savingsBalance += (savingsBalance * annualInterestRate) / 12;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public static void main(String[] args) {
        SavingsAccount.modifyInterestRate(0.04);
        SavingsAccount saver = new SavingsAccount(2000);
        saver.calculateMonthlyInterest();
        System.out.println("Savings Balance: " + saver.savingsBalance);
    }
}
