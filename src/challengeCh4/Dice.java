package challengeCh4;

public class Dice {

  public int roll() {
//    return (int)(Math.random() * 6) + 1;
//    return (int)(Math.round(Math.random() * 10) % 6 + 1); // Math.round() -> 반올림
    return (int)(Math.ceil(Math.random() * 6)); // Math.ceil() -> 소수점이 있으면 무조건 반올림
  }
}
