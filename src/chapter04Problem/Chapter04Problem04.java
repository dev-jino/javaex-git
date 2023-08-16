package chapter04Problem;

public class Chapter04Problem04 {
  public static void main(String[] args) {

    int dice1 = 0;
    int dice2 = 0;
    int sum = 0;

    while (sum != 5) {
      dice1 = (int)(Math.random() * 6) + 1;
      dice2 = (int)(Math.random() * 6) + 1;
      sum = dice1 + dice2;
      System.out.printf("(%d, %d), sum = %d\n", dice1, dice2, sum);
    }
  }
}
