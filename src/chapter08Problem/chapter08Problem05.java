package chapter08Problem;

public class chapter08Problem05 {
}

interface Remocon {
  public void powerOn();
}

class TV implements Remocon {
  @Override
  public void powerOn() {
    System.out.println("TV를 켰습니다.");
  }

  public static void main(String[] args) {
    Remocon r = new TV();
    r.powerOn();
  }
}