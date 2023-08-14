package chapter05;

import java.util.Scanner;

public class Array1Demo {
  public static void main(String[] args) {
    // 표준입력으로 5개의 과목 점수를 입력받아서 배열에 저장한다.
    Scanner sc = new Scanner(System.in);
    int[] scores = new int[5];
    int sum = 0;
    float avg = 0.0f;

    for (int i = 0; i < scores.length; i++) {
      scores[i] = sc.nextInt();
    }
    sc.close();

    // 배열에 들어가 있는 점수의 총합과 평균을 구하라.
    for (int score : scores) {
      sum += score;
    }
    avg = sum / (float)scores.length;

    System.out.printf("sum = %d, avg = %.1f\n", sum, avg);
  }
}
