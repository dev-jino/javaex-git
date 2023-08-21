package chapter08Problem;

public class chapter08Problem08 {
  public static void action(A1 a1) {
    a1.method1();
    if (a1 instanceof C1) {
      ((C1) a1).method2();
    }
  }

  public static void main(String[] args) {
    action(new B1());
    action(new C1());
  }
}

interface A1 {
  public void method1();
}

class B1 implements A1 {
  @Override
  public void method1() {
    System.out.println("B1 - method1()");
  }
}

class C1 implements A1 {
  @Override
  public void method1() {
    System.out.println("C1 - method1()");
  }

  public void method2() {
    System.out.println("C1 - method2()");
  }
}