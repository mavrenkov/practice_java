package day_06;

public class BankAccountObject {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.deposit(500);
        account1.withDraw(200);
        account1.checkAvailableBalance();
    }
}
