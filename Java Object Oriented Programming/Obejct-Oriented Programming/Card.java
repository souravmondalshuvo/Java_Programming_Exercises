public class Card {

    public double balance;
    public String type;

    public Card(double balance, String type) {
        this.balance = balance;
        this.type = type;

        System.out.println(type + " Card created successfully.");
        System.out.println("Balance: " + this.balance + " tk");
    }

    public void addMoneyFromAccount(double amount, MFS account) {
        if(account.balance < amount) {
            System.out.println("Insufficient account balance!");
            return;
        }

        account.balance -= amount;
        this.balance += amount;

        System.out.println("Added " + amount + " tk to card from MFS account#" + account.accNo + ".");
        System.out.println("New balance in card: " + this.balance + " tk");
    }
}