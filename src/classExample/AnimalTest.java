package classExample;

public class AnimalTest {
  public static void main(String[] args) {
    Object obj = new Object();

    Bird bird = new Bird();
    System.out.println("bird = " + bird);
//    bird.헤엄친다();
    bird.먹는다();
    bird.움직인다();
    Tiger tiger = new Tiger();
    System.out.println("tiger = " + tiger);
//    tiger.달린다();
    tiger.숨쉰다();
    tiger.움직인다();
    Animal animal = new Animal();
    System.out.println("animal = " + animal);
    animal.움직인다();
    Fish fish = new Fish();
    System.out.println("fish = " + fish);
    fish.움직인다();
  }
}
