package chapter07Problem;

public class chapter07Problem10 {
}

abstract class Machine {
  public void powerOn() { }
  public void powerOff() { }
  public abstract void work();
}

class Computer extends Machine {
  @Override
  public void work() {

  }
}