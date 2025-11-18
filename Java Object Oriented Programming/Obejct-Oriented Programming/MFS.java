public class MFS {
    public String accNo;
    public double balance;
    public Card card;

    public MFS(String accNo) {
        this.accNo = accNo;
        this.balance = 0.0;
        this.card = null;
        
        System.out.println("Account created.");
        System.out.println("AccNo: " + this.accNo);
        System.out.println("Balance: " + this.balance + " tk");
        System.out.println("Card not saved.");
    }

    public void addNewCard(Card newCard) {
        this.card = newCard;
        System.out.println(this.card.type + " Card added to MFS acc#" + this.accNo);
    }

    public void addMoneyFromCard(double amount) {
        if (this.card == null) {
            System.out.println("Please add a card to your MFS account");
        } else {
            if (this.card.balance >= amount) {
                this.card.balance -= amount;
                this.balance += amount;
                System.out.println("Transfer successful.");
                System.out.println("New MFS account balance: " + this.balance + " tk.");
                System.out.println("Card balance: " + this.card.balance + " tk");
            } else {
                System.out.println("Insufficient balance in " + this.card.type + " Card.");
            }
        }
    }
}