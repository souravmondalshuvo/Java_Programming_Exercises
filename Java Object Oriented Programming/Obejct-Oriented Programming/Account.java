public class Account {
    
    private String name;
    private String account_number;
    private double balance;

    public Account(String name, String account_number, double balance) {
        this.name = name;
        this.account_number = account_number;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return account_number;
    }

    public void setAccountNumber(String account_number) {
        this.account_number = account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public String getAccountInfo() {
        return "Name: " + name + ", Account Number: " + account_number + ", Balance: " + balance;
    }
}
