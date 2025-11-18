/* 
Task 1
Carefully observe the following driver code and expected output. Write the java code for the MFS Class and Card Class both. Consider that there can be at most 1 card per MFS account.

Tester Class
public class CardTester{
  public static void main(String [] args){
    System.out.println("1-----------------");
    MFS bkash = new MFS("12121212");
    System.out.println("2-----------------");
    Card visaCard = new Card(2000, "VISA");
    System.out.println("3-----------------");
    bkash.addMoneyFromCard(5000);
    System.out.println("4-----------------");
    visaCard.addMoneyFromAccount(500, bkash);
    System.out.println("5-----------------");
    bkash.addNewCard(visaCard);
    System.out.println("6-----------------");
    bkash.addMoneyFromCard(5000);
    System.out.println("7-----------------");
    bkash.addMoneyFromCard(800);
    System.out.println("8-----------------");
    visaCard.addMoneyFromAccount(500, bkash);
  }
}

Expected Output
1-----------------
Account created. 
AccNo: 12121212
Balance: 0.0 tk
Card not saved.
2-----------------
VISA Card created successfully.
Balance: 2000.0 tk
3-----------------
Please add a card to your MFS account
4-----------------
Insufficient account balance!
5-----------------
VISA Card added to MFS acc#12121212
6-----------------
Insufficient balance in VISA Card.
7-----------------
Transfer successful.
New MFS account balance: 800.0 tk.
Card balance: 1200.0 tk
8-----------------
Added 500 tk to card from MFS account#12121212.
New balance in card: 1700.0 tk
*/

public class CardTester{
  public static void main(String [] args){
    System.out.println("1-----------------");
    MFS bkash = new MFS("12121212");
    System.out.println("2-----------------");
    Card visaCard = new Card(2000, "VISA");
    System.out.println("3-----------------");
    bkash.addMoneyFromCard(5000);
    System.out.println("4-----------------");
    visaCard.addMoneyFromAccount(500, bkash);
    System.out.println("5-----------------");
    bkash.addNewCard(visaCard);
    System.out.println("6-----------------");
    bkash.addMoneyFromCard(5000);
    System.out.println("7-----------------");
    bkash.addMoneyFromCard(800);
    System.out.println("8-----------------");
    visaCard.addMoneyFromAccount(500, bkash);
  }
}