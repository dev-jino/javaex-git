package chapter07;

public class AbstractMethodEx {
  public static void main(String[] args) {
//    AbstractClass abstractClass = new AbstractClass(); // 추상 클래스는 객체를 생성할 수 없음

  }
}

abstract class Database {
  double PI = 3.14;
  abstract void use();
  abstract double getPI();
}

class Mysql extends Database {
  @Override
  void use() {
    System.out.println("Mysql을 사용합니다.");
  }

  @Override
  double getPI() {
    return 0;
  }
}

class Oracle extends Database {
  @Override
  void use() {
    System.out.println("Oracle을 사용합니다.");
  }

  @Override
  double getPI() {
    return 1;
  }
}