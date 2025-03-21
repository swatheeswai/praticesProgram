import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolderName, double initialBalance, double interestRate) {
        super(accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest); 
        System.out.println("Interest applied: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountHolderName, double initialBalance, double overdraftLimit) {
        super(accountHolderName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
            super.withdraw(amount); 
        } else {
            System.out.println("Exceeded overdraft limit or invalid amount.");
        }
    }
}

public class project3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a SavingsAccount
        System.out.print("Enter account holder name for Savings Account: ");
        String savingsName = scanner.nextLine();
        
        System.out.print("Enter initial balance for Savings Account: ");
        double savingsBalance = scanner.nextDouble();
        
        System.out.print("Enter interest rate for Savings Account: ");
        double interestRate = scanner.nextDouble();
        
        SavingsAccount savingsAccount = new SavingsAccount(savingsName, savingsBalance, interestRate);
        
        // Deposit
        System.out.print("Enter amount to deposit in Savings Account: ");
        double depositAmount = scanner.nextDouble();
        savingsAccount.deposit(depositAmount);
        
        // Withdraw
        System.out.print("Enter amount to withdraw from Savings Account: ");
        double withdrawAmount = scanner.nextDouble();
        savingsAccount.withdraw(withdrawAmount);
        
        // Apply interest
        savingsAccount.applyInterest();
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        
        // Create a CurrentAccount
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter account holder name for Current Account: ");
        String currentName = scanner.nextLine();
        
        System.out.print("Enter initial balance for Current Account: ");
        double currentBalance = scanner.nextDouble();
        
        System.out.print("Enter overdraft limit for Current Account: ");
        double overdraftLimit = scanner.nextDouble();
        
        CurrentAccount currentAccount = new CurrentAccount(currentName, currentBalance, overdraftLimit);
        
        // Deposit
        System.out.print("Enter amount to deposit in Current Account: ");
        double currentDeposit = scanner.nextDouble();
        currentAccount.deposit(currentDeposit);
        
        // Withdraw
        System.out.print("Enter amount to withdraw from Current Account: ");
        double currentWithdraw = scanner.nextDouble();
        currentAccount.withdraw(currentWithdraw);
        
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
        
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}

