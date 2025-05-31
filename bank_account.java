class BankAccount {
    private double balance = 0.0;

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.deposit(1500.75);
        System.out.println("Balance: " + acc.getBalance());

        // Uncommenting the below line will show an error:
        // System.out.println(acc.balance); // Error: balance has private access
    }
}