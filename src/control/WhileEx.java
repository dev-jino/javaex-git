package control;

import java.util.Scanner;

/**
 * 종료를 입력할 때 까지 동물의 이름을 입력받는다. 입력받은 동물의 종류를 출력하라
 * while 문 이용
 */

public class WhileEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String bio = "";
    String kind = "";

    while (true) {
      System.out.println("동물의 이름을 입력하세요. (종료 입력시 종료됩니다.)");
      bio = sc.nextLine();
      kind = "";

      if (bio.equals("종료")) {
        break;
      }
      if (bio.equals("호랑이") || bio.equals("사자")) {
        kind = "포유류";
      } else if (bio.equals("독수리") || bio.equals("참새")) {
        kind = "조류";
      } else {
        kind = "해당없음";
      }
      System.out.printf("%s는 %s입니다.\n", bio, kind);
    }
  }
}
