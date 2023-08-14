package chapter05;

public class String1Ex {
  public static void main(String[] args) {
    String s1 = new String("안녕, 자바");
    String s2 = new String("안녕, 자바");
    System.out.println("생성 후 : " + (s1 == s2));       // 주소값 비교 (새로운 객체 생성시 다름)
    System.out.println(s1.equals(s2));  // 리터럴 비교
    String s3 = "안녕, 자바";
    String s4 = "안녕, 자바";
    int i1 = 10;
    int i2 = 10;

    s1 = s2;
    System.out.println(i1 == i2);
    System.out.println("할당 후 : " + (s1 == s2));       // 주소값 비교
    System.out.println(s1.equals(s2));  // 리터럴 비교
    System.out.println(s3 == s4);
    System.out.println(s3.equals(s4));
    System.out.println(s2);


  }
}
