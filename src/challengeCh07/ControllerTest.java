package challengeCh07;

public class ControllerTest {
  public static void main(String[] args) {
    Controller[] c = {
        new TV(false),
        new Radio(true)
    };

    for (Controller controller : c) {
      controller.show();
    }
  }
}

abstract class Controller {
  boolean power;

  public Controller(boolean power) {
    this.power = power;
  }

  abstract String getName();

  void show() {
    if (this.power) {
      System.out.println(this.getName() + "가 켜졌습니다!");
    } else {
      System.out.println(this.getName() + "가 꺼졌습니다!");
    }
  }
}

class TV extends Controller {
  public TV(boolean power) {
    super(power);
  }

  @Override
  String getName() {
    return "TV";
  }
}

class Radio extends Controller {
  public Radio(boolean power) {
    super(power);
  }

  @Override
  String getName() {
    return "Radio";
  }
}
