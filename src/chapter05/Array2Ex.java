package chapter05;

import java.util.Arrays;

public class Array2Ex {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    for (int num : arr) {
      System.out.println("num = " + num);
    }
    System.out.println(arr);

    // --------------------------------------------------

    System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    // --------------------------------------------------

    char[] cArr = {'a', 'b', 'c'};
    String sArr = "abc";
    for (char ch : cArr) {
      System.out.println("ch = " + ch);
    }
    System.out.println(cArr);
    System.out.println(sArr);
    System.out.println(Arrays.toString(cArr));
  }
}
