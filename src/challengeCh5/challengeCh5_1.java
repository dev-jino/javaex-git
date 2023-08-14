package challengeCh5;

/**
 * 문자열과 문자를 매개변수 값으로 가지는 다음 메서드가 있다.
 * 문자열 s에 포함된 문자 c의 개수를 반환하도록 이 메서드를 구현하시오.
 * (대소문자 관계없이)
 * static int countChar(String s, char c)
 */

public class challengeCh5_1 {
  public static void main(String[] args) {
    System.out.println(countChar("HeLlo", 'l'));
  }

  static int countChar(String s, char c) {
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.toUpperCase().charAt(i) == Character.toUpperCase(c)) {
        count++;
      }
    }
    return count;
  }
}
