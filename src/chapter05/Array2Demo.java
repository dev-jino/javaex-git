package chapter05;

import java.util.ArrayList;
import java.util.Scanner;

public class Array2Demo {
  public static void main(String[] args) {
    // 표준입력으로 학생의 점수를 입력받아서 배열에 저장한다.
    // 학생의 수는 정해져 있지 않고, -1을 입력받을 때까지 배열에 저장한다.
    // -1이 입력되면, 현재 배열에 들어가 있는 점수의 총합과 평균을 구하라.
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> scores = new ArrayList<Integer>();
    int input = 0;
    int sum = 0;
    float avg = 0.0f;

    while (true) {
      System.out.print("학생의 점수를 입력하세요. (-1 입력시 종료됩니다.) : ");
      input = sc.nextInt();
      if (input == -1) {
        break;
      } else if (input < 0) {
        System.out.println("점수는 0보다 작을 수 없습니다.");
      }
      scores.add(input);
    }
    sc.close();

    for (int score : scores) {
      sum += score;
    }
    if (scores.size() == 0) {
      avg = 0;
    } else {
      avg = sum / (float)scores.size();
    }

    System.out.printf("sum = %d, avg = %.1f\n", sum, avg);
  }
}
