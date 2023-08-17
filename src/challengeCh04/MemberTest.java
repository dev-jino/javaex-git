package challengeCh04;

public class MemberTest {
  public static void main(String[] args) {
    Member member = new Member("홍길동", "gildong", "1234", 130);

    member.setAge(20);

    System.out.printf("%s의 나이는 %d 입니다.",member.getName() ,member.getAge());
  }
}
