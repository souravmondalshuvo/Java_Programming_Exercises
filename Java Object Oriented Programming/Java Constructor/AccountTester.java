//Constructor with Validation

class Account {
    
    public String accountNumber;
    public double balance;

    public Account(String accountNumber, double balance) {
        if(accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Error: Account number cannot be null or empty.");
            return;
        }

        if(balance < 0) {
            System.out.println("Error: Balance cannot be negative.");
            return;
        }
        
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

public class AccountTester {
    public static void main(String[] args) {
        
        Account account1 = new Account("12340009", 1000.00);
        System.out.println("Account 1 Number: " + account1.accountNumber);
        System.out.println("Account 1 Balance: " + account1.balance);

        @SuppressWarnings("unused")
        Account account2 = new Account("", 400.00);

        @SuppressWarnings("unused")
        Account account3 = new Account("1230000873", -200.00);
    }
}