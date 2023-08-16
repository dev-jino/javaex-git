package chapter05;

public class VarArgsEx {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    printSum(1, 2, 3, 4, 5);
    printSum(10, 20, 30);
    printSum(numbers);
  }

  static void printSum(int... nums) {
    int sum = 0;
    
    for (int num : nums) {
      sum += num;
    }
    System.out.println("sum = " + sum);
  }
}
