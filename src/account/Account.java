package account;

public class Account {
    int balance;
    public int checkBalance(String pin) {
        return  balance;
    }
    public int deposit(int amount) {
        if(amount > 0){balance = balance + amount;}
        return balance;
    }
    public int withDraw(int amount) {
       if(balance >= amount && amount > 0) {balance = balance - amount;}
        return balance;
    }
    public int transfer(int amount) {

        withDraw(amount);
        deposit(amount);
        return amount;
    }

}
