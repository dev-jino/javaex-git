package chapter06;

public class CarClassCastEx {
  public static void main(String[] args) {
    Vehicle v = new Car();
    System.out.println("v.name = " + v.name);
    v.whoAmI(); // upcasting을 하더라도 자식클래스에 오버라이드 된 메서드가 출력됨
    v.move();

    Vehicle v1 = new Vehicle();
    v1.whoAmI();

    Vehicle[] vehicles = new Vehicle[3];
    vehicles[0] = v1;
    vehicles[1] = new Car();
    vehicles[2] = new SportsCar();

    for (Vehicle vehicle : vehicles) {
      vehicle.whoAmI();
    }
  }
}
