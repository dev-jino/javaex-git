package chapter08Problem;

public interface Database {
  void use();
}

class Mysql implements Database {
  @Override
  public void use() {
    System.out.println("MySQL을 사용한다.");
  }
}

class Oracle implements Database {
  @Override
  public void use() {
    System.out.println("Oracle을 사용한다.");
  }
}