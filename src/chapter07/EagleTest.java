package chapter07;

public class EagleTest {
  public static void main(String[] args) {
    Eagle e = new Eagle();
    e.fly();

    ABird b = new ABird() {
      @Override
      void fly() {
        System.out.println("이름없는 새가 날아간다.");
      }
    };
    b.fly();
  }
}

class Eagle extends ABird {
  @Override
  void fly() {
    System.out.println("독수리가 날아간다.");
  }
}
