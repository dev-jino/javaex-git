package chapter04Problem;

import java.util.Scanner;

public class Chapter04Problem07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice = 0;
    long money = 0;
    long balance = 0;


    while (true) {
      System.out.println("------------------------");
      System.out.println("1.예금|2.출금|3.잔고|4.종료");
      System.out.println("------------------------");
      System.out.print("선택> ");
      choice = sc.nextInt();

      if (choice == 4) {
        System.out.println("프로그램 종료");
        break;
      }

      if (choice == 1) {
        System.out.print("예금액> ");
        money = sc.nextInt();
        balance += money;
      } else if (choice == 2) {
        System.out.print("출금액> ");
        money = sc.nextInt();
        if (balance >= money) {
          balance -= money;
        } else {
          System.out.println("잔액이 부족합니다.");
        }
      } else if (choice == 3) {
        System.out.println("잔고> " + balance);
      }
    }
  }
}
