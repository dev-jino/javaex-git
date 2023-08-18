package chapter06Problem;

public class Account {
  static final int MIN_BALANCE = 0;
  static final int MAX_BALANCE = 1_000_000;
  private int balance;

  public void setBalance(int balance) {
    if (balance < MIN_BALANCE || balance > MAX_BALANCE) {
      return ;
    }
    this.balance = balance;
  }

  public int getBalance() {
    return balance;
  }

  public void withdraw(int money) {
    if (money >= 0) {
      int remains = balance - money;
      if (remains >= MIN_BALANCE && remains <= MAX_BALANCE) {
        balance = remains;
      }
    }
  }

  public void deposit(int money) {
    if (money >= 0) {
      int remains = balance + money;
      if (remains >= MIN_BALANCE && remains <= MAX_BALANCE) {
        balance = remains;
      }
    }
  }
}
