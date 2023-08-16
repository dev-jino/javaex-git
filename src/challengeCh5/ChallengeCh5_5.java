package challengeCh5;

import java.util.Scanner;

/**
 * 0~99 사이의 정수를 키보드에서 10개 입력받아 10 단위 간격의 히스토그램을 출력하는 프로그램을 작성하시오.
 * 입력된 수가 음수이면 무시하시오.
 * 예를 들어 위쪽처럼 10개의 정수가 입력되었을 때는 아래쪽처럼 히스토그램을 출력한다.
 *
 * Ex) 입력 숫자
 * 37 79 95 14 17 33 -1 30 50 55
 *
 * 0~9:
 * 10~19:**
 * 20~29:
 * 30~39:***
 * 40~49:
 * 50~59:**
 * 60~69:
 * 70~79:*
 * 80~89:
 * 90~99:*
 */

public class ChallengeCh5_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = 0;
    int[] output = new int[10];

    for (int i = 0; i < 10; i++) {
      input = sc.nextInt();
      if (input >= 0 && input < 100) {
        output[input / 10]++;
      }
    }

    for (int i = 0; i < 10; i++) {
      System.out.printf("%d~%d :", i * 10, i * 10 + 9);
      for (int j = 0; j < output[i]; j++) {
          System.out.print("*");
      }
      System.out.println();
    }
  }
}
