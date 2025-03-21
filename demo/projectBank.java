import java.util.Scanner;


class Bank {
    private String accountName;
    private int accountNumber;
    private double balance;
    private long phoneNo;

    public Bank(String accountName, int accountNumber, double balance, long phoneNo) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.phoneNo = phoneNo;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.priantln("Withdraw amount you received: " + amount);
        } else {
            System.out.println("Insufficient amount");
        }
    }

    public double checkBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "\nAccount Name: " + accountName +
               "\nAccount Number: " + accountNumber +
               "\nBalance: " + balance +
               "\nPhone Number: " + phoneNo;
    }
}
class SavingsBank extends Bank {
    private int withdrawalCount;
    private final int MAX_WITHDRAWALS = 3;

    public SavingsBank(String accountName, int accountNumber, double balance, long phoneNo) {
        super(accountName, accountNumber, balance, phoneNo);
        this.withdrawalCount = 0;
    }

    @Override
    public void withdraw(double amount) {
        if (withdrawalCount >= MAX_WITHDRAWALS) {
            System.out.println("Withdrawal limit exceeded for this month.");
            return;
        }

        super.withdraw(amount); // Call the superclass method
        if (getBalance() >= amount) {
            withdrawalCount++;
        }
    }
}

public class projectBank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Initialize with example data
        SavingsBank savingsBank = new SavingsBank("Swathi", 12345, 100.0, 8679584788L);
        
        System.out.println(savingsBank);
        System.out.println("----------------------------------------");
          
        System.out.println("Enter the Account Number:");
        int accountNumber = scan.nextInt();
       if (accountNumber == savingsBank.getAccountNumber()){
        while (true) {
   
                System.out.println("Press 1: Deposit Amount");
                System.out.println("Press 2: Withdraw Amount");
                System.out.println("Press 3: Change Phone Number");
                System.out.println("Press 4: Check Balance");
                System.out.println("Press 5: Exit");
                System.out.println("Enter your choice:");
                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter your deposit amount:");
                        double depositAmount = scan.nextDouble();
                        savingsBank.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.println("Enter your withdraw amount:");
                        double withdrawAmount = scan.nextDouble();
                        savingsBank.withdraw(withdrawAmount); // Call the overridden method
                        break;
                    case 3:
                        System.out.println("Enter new phone number:");
                        long newPhoneNo = scan.nextLong();
                        savingsBank.setPhoneNo(newPhoneNo);
                        System.out.println("Phone number changed to: " + savingsBank.getPhoneNo());
                        break;
                    case 4:
                        System.out.println("Current balance: " + savingsBank.checkBalance());
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scan.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } 
            }else {
                System.out.println("Please enter a valid account number.");
            }
            System.out.println("----------------------------------------");
        }
    }


