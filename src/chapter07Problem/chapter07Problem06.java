package chapter07Problem;

public class chapter07Problem06 {
}

class Parent {
  public String name;

  public Parent(String name) {
    this.name = name;
  }
}

class Child extends Parent {
  public int studnetNo;

  public Child(String name, int studnetNo) {
//    this.name = name;
    super(name);
    this.studnetNo = studnetNo;
  }
}