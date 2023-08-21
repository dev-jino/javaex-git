package chapter07;

public class Coin1Demo {
  public static void main(String[] args) {
    System.out.println("Dime은 " + Coin.DIME + " 센트입니다.");
  }
}

interface Coin {
  public static final int PENNY = 1;
  public static final int NICKEL = 5;
  public static final int DIME = 10;
  public static final int QUARTER = 25;
}