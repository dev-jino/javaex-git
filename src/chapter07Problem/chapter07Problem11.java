package chapter07Problem;

public class chapter07Problem11 {
  public static void main(String[] args) {
    MainActivity mainActivity = new MainActivity();
    mainActivity.onCreate();
  }

}

class Activity {
  public void onCreate() {
    System.out.println("기본적인 실행 내용");
  }
}

class MainActivity extends Activity {
  @Override
  public void onCreate() {
    super.onCreate();
    System.out.println("추가적인 실행 내용");
  }
}