package chapter06;

public class TypeConvertEx {
  public static void main(String[] args) {
//    Person p = new Person();
//    Student s = new Student();
//
//    String name = s.name;
//    int number = s.number;
//    s.work();
//    s.whoAmI();
//
//    name = p.name;
//    p.whoAmI();

    Person p;
    Student s = new Student();
    Worker w = new Worker();
    p = s;
    String name = p.name;
    p.whoAmI();

    p = w;
    p.whoAmI();

//    s = w; // 부모-자식(상속) 관계가 아니므로 형변환 불가능, 형제도 안됨
//    String s1;
//    s1 = w; // 부모-자식(상속) 관계가 아니므로 형변환 불가능

    Object o = new Person();
    o = s;
    o = p;
    Person p1 = new Student();
    Person p2 = new Worker();
  }
}
