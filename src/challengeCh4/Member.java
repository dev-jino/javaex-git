package challengeCh4;

public class Member {
  private String name;
  private String id;
  private String password;
  private int age;

  public Member(String name, String id, String password, int age) {
    this.name = name;
    this.id = id;
    this.password = password;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public String getPassword() {
    return password;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (!(age >= 0 && age <= 120)) {
      System.out.println("나이 입력 오류 (가능 범위 0~120)");
      return;
    }
    this.age = age;
  }
}
