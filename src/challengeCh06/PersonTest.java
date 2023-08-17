package challengeCh06;

public class PersonTest {
  public static void main(String[] args) {
    Person[] persons = {
        new Person("길동이", 22),
        new Student("황진이", 23, 100),
        new ForeignStudent("Amy", 30, 200, "U.S.A")
    };

    for (Person person : persons) {
//      if (person instanceof ForeignStudent) {
//        ((ForeignStudent)person).show();
//      } else if (person instanceof Student) {
//        ((Student)person).show();
//      } else if (person instanceof Person) {
//        person.show();
//      }
      person.show();
    }
  }
}

class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  void show() {
    System.out.printf("사람[이름 : %s, 나이 : %d]\n", name, age);
  }
}

class Student extends Person {
  private int num;

  public Student(String name, int age, int num) {
    super(name, age);
    this.num = num;
  }

  public int getNum() {
    return num;
  }

  @Override
  void show() {
    System.out.printf("사람[이름 : %s, 나이 : %d, 학번 : %d]\n", super.getName(), super.getAge(), num);
  }
}

class ForeignStudent extends Student {
  private String nation;

  public ForeignStudent(String name, int age, int num, String nation) {
    super(name, age, num);
    this.nation = nation;
  }

  public String getNation() {
    return nation;
  }

  @Override
  void show() {
    System.out.printf("사람[이름 : %s, 나이 : %d, 학번 : %d, 국적 : %s]\n", super.getName(), super.getAge(), super.getNum(), nation);
  }
}