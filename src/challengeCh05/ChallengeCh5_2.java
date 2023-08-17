package challengeCh05;

/**
 * 다음 코드를 실행하면 9, 5, 14를 두 번 출력한다.
 * 여기서 sum() 메서드를 하나로 완성하시오.
 * (힌트) 자바는 가변 길이 변수를 배열처럼 취급한다.
 *
 * public static void main(String[] args) {
 *   System.out.println(sum(1, 2, 3, 4));
 *   int arr[] = {2, 3};
 *   System.out.println(sum(1, arr));
 *   System.out.println(sum(1, 2, 3, 4, 5));
 * }
 *
 * 결과 :
 * 9
 * 5
 * 14
 */

public class ChallengeCh5_2 {
  public static void main(String[] args) {
    System.out.println(sum(1, 2, 3, 4));
    int[] arr = {2, 3};
    System.out.println(sum(1, arr));
    System.out.println(sum(1, 2, 3, 4, 5));
  }

  public static int sum(int i, int... inputs) {
    int sum = 0;
    for (int input : inputs) {
      sum += input;
    }
    return sum;
  }
}
