package challengeCh5;

import java.util.Arrays;
import java.util.Scanner;

public class EnumScoreTest {
  public static void main(String[] args) {
    int numOfStudents = 0;
    Grade grade;
    Scanner sc = new Scanner(System.in);

    System.out.print("학생의 수를 입력하세요 : ");
    numOfStudents = sc.nextInt();
    int[] scores = new int[numOfStudents];

    for (int i = 0; i < scores.length; i++) {
      System.out.print("학생의 점수를 입력하세요 : ");
      scores[i] = sc.nextInt();
    }

    System.out.println(Arrays.toString(scores));

    for (int i = 0; i < scores.length; i++) {
      if (scores[i] >= 90) {
        grade = Grade.A;
      } else if (scores[i] >= 80) {
        grade = Grade.B;
      } else {
        grade = Grade.C;
      }
      System.out.printf("%d 번째 학생의 점수는 %d, 등급은 %s 입니다.\n", i + 1, scores[i], grade.getGrade());
    }


  }
}
