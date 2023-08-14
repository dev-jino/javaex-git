package challengeCh5;

public class challengeCh5_2 {
  public static void main(String[] args) {
    System.out.println(sum(1, 2, 3, 4));
    int[] arr = {2, 3};
    System.out.println(sum(1, arr));
    System.out.println(sum(1, 2, 3, 4, 5));
  }

  public static int sum(int i, int... inputs) {
    int sum = 0;
    for (int input : inputs) {
      sum += input;
    }
    return sum;
  }
}
