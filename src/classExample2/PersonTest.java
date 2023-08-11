package classExample2;

public class PersonTest {
  public static void main(String[] args) {
    Person person = new Person();
    person.setName("민국");
    person.setAge(12);
    person.sayHello();

    person.setName("민국").setAge(12).sayHello();

    Person person2 = new Person();
    person2.setName("대한").setAge(21).sayHello();
  }
}
