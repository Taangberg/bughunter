/* Skriv en klasse til at håndtere bankkonti */

void main() {
    Account konto = new Account(1000);
    konto.withdraw(1200);
    konto.deposit(100);
    IO.println(konto.balance);
}

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }
}



