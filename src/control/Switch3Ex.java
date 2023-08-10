package control;

import java.util.Scanner;

public class Switch3Ex {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("동물의 이름을 입력하세요.");
    String bio = sc.nextLine();
    String kind = "";
    if (bio.equals("호랑이") || bio.equals("사자")) {
      kind = "포유류";
    } else if (bio.equals("독수리") || bio.equals("참새")) {
      kind = "조류";
    } else {
      kind = "해당없음";
    }
    System.out.printf("%s는 %s입니다.\n", bio, kind);

    System.out.println("동물의 이름을 입력하세요.");
    bio = sc.nextLine();
    kind = "";

//    switch (bio) {
//      case "호랑이" :
//      case  "사자" :
//        kind = "포유류";
//        break;
//      case "독수리" :
//      case  "참새" :
//        kind = "조류";
//        break;
//      default:
//        kind = "해당없음";
//    }
//    System.out.printf("%s는 %s입니다. %d 글자입니다.\n", bio, kind, kind.length());

    switch (bio) {
      case "호랑이", "사자" -> System.out.printf("%s는 포유류입니다.\n", bio);
      case "독수리", "참새" -> System.out.printf("%s는 조류입니다.\n", bio);
      default -> System.out.printf("%s는 해당없음입니다.\n", bio);
    }
  }
}
