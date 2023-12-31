package chapter07;

public class AnonymousDemo {
  public static void main(String[] args) {
//    Parent p = new OnlyOnce();
//    p.parent();
    // 익명 클래스 (Anonymous class) -
    // 클래스의 선언과 객체의 생성을 동시에 하는 이름 없는 클래스(일회용)
    Parent p = new Parent() {
      @Override
      public void parent() {
        System.out.println("익명클래스에서 구현한 메서드");
      }
    };
  }
}

//class OnlyOnce implements Parent {
//  @Override
//  public void parent() {
//    System.out.println("parent");
//  }
//}

interface Parent {
  void parent();
}