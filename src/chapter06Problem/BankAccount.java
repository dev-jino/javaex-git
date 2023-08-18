package chapter06Problem;

public class BankAccount {
  static final int MIN_BALANCE = 0;
  private String accountNo;
  private String name;
  private int balance;

  public BankAccount(String accountNo, String name, int balance) {
    this.accountNo = accountNo;
    this.name = name;
    this.balance = balance;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBalance(int balance) {
    if (balance > MIN_BALANCE) {
      this.balance = balance;
    }
  }

  public String getAccountNo() {
    return accountNo;
  }

  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  public boolean deposit(int money) {
    if (money >= 0) {
      int remains = balance + money;
      if (remains >= MIN_BALANCE) {
        balance = remains;
        return true;
      }
    }
    return false;
  }

  public boolean withdraw(int money) {
    if (money > 0) {
      int remains = balance - money;
      if (remains >= MIN_BALANCE) {
        balance = remains;
        return true;
      }
    }
    return false;
  }
}
