package challengeCh5;

import java.util.Scanner;

/**
 * 다음과 같이 키보드에서 URL을 입력받은 후 'com'으로 끝나는지,
 * 'java'를 포함하는지 조사하는 프로그램을 작성하시오.
 * 'bye'를 입력하면 프로그램은 종료된다.
 *
 * URL을 입력하세요: www.java.com
 * www.java.com은 'com'으로 끝납니다.
 * www.java.com은 'java'를 포함합니다.
 *
 * URL을 입력하세요: bye
 */

public class challengeCh5_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("URL을 입력하세요 : ");
      String input = sc.nextLine();

      if (input.equalsIgnoreCase("bye")) {
        break ;
      }

      if (input.toLowerCase().endsWith("com".toLowerCase())) {
        System.out.println(input + "은 \'com\'으로 끝납니다.");
      }

      if (input.toLowerCase().contains("java".toLowerCase())) {
        System.out.println(input + "은 \'java\'를 포함합니다.");
      }
    }
  }
}
