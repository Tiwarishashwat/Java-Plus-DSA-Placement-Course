class BankAccount {
    // private data (hidden from outside)
    private String accountNumber;
    private double balance;

    // constructor
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // getter for balance
    public double getBalance() {
        return balance;
    }

    // controlled update through setter method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", 1000);

        // Access through methods only
        System.out.println("Account No: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());

        acc.deposit(500);
        acc.withdraw(200);

        //  Not allowed (balance is private)
        // acc.balance = 100000;
    }
}
