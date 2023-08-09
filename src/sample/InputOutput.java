package sample;

import java.util.Scanner;

public class InputOutput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    int i = sc.nextInt();
//
//    System.out.println("i = " + i);
    /////////////////////////////////////////////

    /////////////////////////////////////////////

//    String s = sc.nextLine();
//    int i2 = Integer.parseInt(s);
//
//    System.out.println("i2 = " + i2);
//
//    sc.close();

    /////////////////////////////////////////////

    int a = 1_000_000;
    int b = 2_000_000;
    long c = a * (long)b;
    System.out.println(c);

    /////////////////////////////////////////////

//    int res = 5 / 0;
    double res2 = 5 / 0.0;
    double r = 5 % 0.0;
    boolean b1 = Double.isInfinite(res2);
    boolean b2 = Double.isNaN(r);

//    System.out.println("res = " + res);
    System.out.println("(res2 + 2) = " + (res2 + 2));
    System.out.println("(r + 2) = " + (r + 2));
    System.out.println("b1 = " + b1);
    System.out.println("b2 = " + b2);
  }
}
