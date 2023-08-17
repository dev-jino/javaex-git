package challengeCh04;

public class DiceTest {
  public static void main(String[] args) {
    Dice dice = new Dice();
    for (int i = 0 ; i < 6 ; i++) {
      System.out.println("주사위의 숫자 : " + dice.roll());
    }
  }
}
