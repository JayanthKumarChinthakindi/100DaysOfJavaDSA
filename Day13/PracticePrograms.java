import java.util.Scanner;
class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;
    // Parameterized Constructor
    BankAccount(
        String accountHolder,
        long accountNumber,
        double balance
    ) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // Deposit money
    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        System.out.println("₹" + amount +" deposited successfully.");
    }
    // Withdraw money
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.println("₹" + amount +" withdrawn successfully.");
    }
    // Display balance
    void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
    // Display account details
    void displayAccountDetails() {
        System.out.println("Account Holder: " +accountHolder);
        System.out.println("Account Number: " +accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}
public class PracticePrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BANK ACCOUNT SYSTEM");
        // Create first account
        BankAccount account1 =
            new BankAccount(
                "Rahul",
                1001,
                10000
            );
        // Create second account
        BankAccount account2 =
            new BankAccount(
                "Priya",
                1002,
                15000
            );
        // Account 1
        System.out.println("ACCOUNT 1");
        account1.displayAccountDetails();
        System.out.print("Enter deposit amount: ₹");
        double depositAmount =
            sc.nextDouble();
        account1.deposit(depositAmount);
        System.out.print("Enter withdrawal amount: ₹");
        double withdrawAmount =
            sc.nextDouble();
        account1.withdraw(withdrawAmount);
        account1.displayBalance();
        // Account 2
        System.out.println("ACCOUNT 2");
        account2.displayAccountDetails();
        System.out.print("Enter deposit amount: ₹");
        double depositAmount2 =
            sc.nextDouble();
        account2.deposit(depositAmount2);
        System.out.print("Enter withdrawal amount: ₹");
        double withdrawAmount2 =
            sc.nextDouble();
        account2.withdraw(withdrawAmount2);
        account2.displayBalance();
        sc.close();
    }
}