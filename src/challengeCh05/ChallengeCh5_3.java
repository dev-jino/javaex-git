package challengeCh05;

/**
 * 3년간 분기별 이자율에 대한 연평균 이자율과 평균 이자율을 출력하는 예제이다.
 * 이를 for~each 문을 사용해 작성하시오.
 *
 * public static void main(String[] args) {
 *     double[][] interests = {{3.2, 3.1, 3.2, 3.0}, {2.9, 2.8, 2.7, 2.6}, {2.7, 2.6, 2.5, 2.7}};
 *     double[] sum1 = {0.0, 0.0, 0.0};
 *     double sum2 = 0.0;
 *
 *     for (int i = 0; i < interests.length; i++) {
 *       for (int j = 0; j < interests[i].length; j++) {
 *         sum1[i] += interests[i][j];
 *       }
 *       System.out.printf("%d차년도 평균 이자율 = %.2f%%\n", i+1, sum1[i]/4);
 *       sum2 += sum1[i];
 *     }
 *     System.out.printf("%d년간 평균 이자율 = %.2f%%\n", sum1.length, sum2/3);
 *   }
 */


public class ChallengeCh5_3 {
  public static void main(String[] args) {
    double[][] interests = {{3.2, 3.1, 3.2, 3.0}, {2.9, 2.8, 2.7, 2.6}, {2.7, 2.6, 2.5, 2.7}};
    double[] sum1 = {0.0, 0.0, 0.0};
    double sum2 = 0.0;

    int i = 0;
    for (double[] interest : interests) {
      for (double interestEach : interest) {
        sum1[i] += interestEach;
      }
      System.out.printf("%d차년도 평균 이자율 = %.2f%%\n", i+1, sum1[i]/4);
      sum2 += sum1[i];
      i++;
    }
    System.out.printf("%d년간 평균 이자율 = %.2f%%\n", sum1.length, sum2/3);
  }
}
