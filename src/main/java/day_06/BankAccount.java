package day_06;

public class BankAccount {
    String accountName;
    int accountNumber;
    int balance;

    public void deposit(int addMoney){
        balance += addMoney;
    }
    public void withDraw(int getMoney){
        balance -= getMoney;
    }
    public void checkAvailableBalance(){
        System.out.println("Your current balance is $"+ balance);
    }


}