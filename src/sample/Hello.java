package sample;

/**
 * Hello sample class
 * main-method
 * hello 출력하는 프로그램
 */

public class Hello {
  public static void main(String[] args) {
    String hello = "안녕 !";

    System.out.println("hello world!");
    System.out.println(hello);

    ////////////////////////////////////////

    final double PI = 3.14159;
    // PI = 3.14; // 상수는 값을 변경할 수 없음
    var num = 100;
    var name = "hello";
    long i = 3_100_000_000L;
    double d = 3.14f;
    byte b = 120; // 리터럴은 가능
    // b = num; // num의 숫자(변수)가 언제 변경될 지 모르기 때문에 에러
    float f = (float)3.14;
    byte b1 = (byte)300;

    System.out.println(f);
    System.out.println(b1);

    ///////////////////////////////////////

    char zero = '0';
    char three = 3 + '0';
    int i2 = '3' - '0';
    String str3 = 3 + "";
    int i3 = Integer.parseInt(str3);
    int res = i3 + 10;
    double d3 = Double.parseDouble(str3);
    double res2 = d3 + 10;
    char c = "3".charAt(0);

    System.out.println(three);
    System.out.println(i2);
    System.out.println(str3);
    System.out.println(i3);
    System.out.println(res);
    System.out.println(res2);
    System.out.println(c);

    //////////////////////////////////////

    int result = 7 / 4;
    double result2 = 7 / (double)4;

    System.out.println(result);
    System.out.println(result2);

    System.out.println("result2 = " + result2);
    System.out.printf("i3 = %d and d3 = %f\n", i3, d3);
  }
}
