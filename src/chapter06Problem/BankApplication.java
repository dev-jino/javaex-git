package chapter06Problem;

import java.util.Scanner;

public class BankApplication {
  static BankAccount[] bankAccounts = new BankAccount[100];
  static Scanner sc = new Scanner(System.in);
  static int count;
  static String[] info = new String[3];

  public static void main(String[] args) {
    int input = 0;

    while (true) {
      System.out.println("-------------------------------------");
      System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
      System.out.println("-------------------------------------");
      System.out.print("선택> ");
      input = Integer.parseInt(sc.nextLine());
      if (input == 5) {
        System.out.println("프로그램 종료");
        break;
      }
      if (input == 1) {
        createAccount();
      } else if (input == 2) {
        accountList();
      } else if (input == 3) {
        depositMoney();
      } else if (input == 4) {
        withdrawMoney();
      } else {
        System.out.println("1~5의 숫자를 입력해주세요.");
      }
    }

  }

  static void createAccount() {
    System.out.println("----------");
    System.out.println("계좌생성");
    System.out.println("----------");
    System.out.print("계좌번호: ");
    info[0] = sc.nextLine();
    System.out.print("계좌주: ");
    info[1] = sc.nextLine();
    System.out.print("초기입금액: ");
    info[2] = sc.nextLine();
    for (int i = 0 ; i < bankAccounts.length ; i++) {
      if (bankAccounts[i] == null) {
        bankAccounts[i] = new BankAccount(info[0], info[1], Integer.parseInt(info[2]));
        System.out.println("결과: 계좌가 생성되었습니다.");
        break;
      } else if (bankAccounts[i].getAccountNo().equals(info[0])) {
        System.out.println("오류 : 중복(동일한 계좌가 존재합니다.)");
        break;
      }
    }
  }

  static void accountList() {
    System.out.println("----------");
    System.out.println("계좌목록");
    System.out.println("----------");

    for (int i = 0 ; i < bankAccounts.length ; i++) {
      if (bankAccounts[i] == null) {
        break;
      }
      System.out.printf("%s\t%s\t%d\n",
          bankAccounts[i].getAccountNo(),
          bankAccounts[i].getName(),
          bankAccounts[i].getBalance());
    }
  }

  static void depositMoney() {
    System.out.println("----------");
    System.out.println("예금");
    System.out.println("----------");
    System.out.print("계좌번호: ");
    String accountNo = sc.nextLine();
    System.out.print("예금액: ");
    int money = Integer.parseInt(sc.nextLine());

//    for (int i = 0 ; i < bankAccounts.length ; i++) {
//      if (bankAccounts[i] == null) {
//        System.out.println("결과: 예금에 실패했습니다.");
//        break;
//      } else if (bankAccounts[i].getAccountNo().equals(info[0])) {
//        if (bankAccounts[i].deposit(Integer.parseInt(info[1]))) {
//          System.out.println("결과: 예금에 성공했습니다.");
//          System.out.printf("%s\t%d\n", bankAccounts[i].getAccountNo(), bankAccounts[i].getBalance());
//          break;
//        }
//      }
//    }

//    findAccount(accountNo).deposit(money);

    BankAccount findAccount = findAccount(accountNo);
    if (findAccount.deposit(money)) {
      System.out.println("결과: 입금에 성공했습니다.");
      System.out.printf("%s\t%d\n", findAccount.getAccountNo(), findAccount.getBalance());
    } else {
      System.out.println("결과: 입금에 실패했습니다.");
    }
  }

  static void withdrawMoney() {
    System.out.println("----------");
    System.out.println("출금");
    System.out.println("----------");
    System.out.print("계좌번호: ");
    String accountNo = sc.nextLine();
    System.out.print("예금액: ");
    int money = Integer.parseInt(sc.nextLine());

//    for (int i = 0 ; i < bankAccounts.length ; i++) {
//      if (bankAccounts[i] == null) {
//        System.out.println("결과: 출금에 실패했습니다.");
//        break;
//      } else if (bankAccounts[i].getAccountNo().equals(info[0])) {
//        if (bankAccounts[i].withdraw(Integer.parseInt(info[1]))) {
//          System.out.println("결과: 출금에 성공했습니다.");
//          System.out.printf("%s\t%d\n", bankAccounts[i].getAccountNo(), bankAccounts[i].getBalance());
//          break;
//        }
//      }
//    }

//    findAccount(accountNo).withdraw(money);

    BankAccount findAccount = findAccount(accountNo);
    if (findAccount.withdraw(money)) {
      System.out.println("결과: 출금에 성공했습니다.");
      System.out.printf("%s\t%d\n", findAccount.getAccountNo(), findAccount.getBalance());
    } else {
      System.out.println("결과: 출금에 실패했습니다.");
    }
  }

  static BankAccount findAccount(String accountNo) {
    BankAccount returnAccount = null;

    for (BankAccount bankAccount : bankAccounts) {
      if (bankAccount == null) {
        break;
      } else if (bankAccount.getAccountNo().equals(accountNo)) {
        returnAccount = bankAccount;
        break;
      }
    }
    return returnAccount;
  }
}