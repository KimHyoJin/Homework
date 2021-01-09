import java.util.HashMap;
import java.util.Scanner;

public class VehicleReservationProgram {

  private static Scanner scanner = new Scanner(System.in);

  public static void printMenu() {
    System.out.println("차량------------ 예약관리프로그램입니다------------- ");
    System.out.println("1. 회원가입 | 2. 로그인 | 3. 차량예약 관리 | 4. 로그아웃 | 5. 종료");
    System.out.println(" ------------------------------------------------------- ");
  }

  public static void main(String[] args) {
    VehicleManager vihiclemanager = new VehicleManager();
    AccountManager accountmanager = new AccountManager();
    HashMap<String, Account> accountHash;

    Account current_account = null;
    while (true) {
      printMenu();
      System.out.print("선택>> ");
      int selectNo = scanner.nextInt();
      if (selectNo == 1) { // 회원가입
        accountmanager.signUp();
      } else if (selectNo == 2) { // 로그인
        current_account = accountmanager.login();
      } else if (selectNo == 3) { // 차량 예약 관리
        if (current_account == null) {
          System.out.println("로그인 하십시오.");
        } else {
          vihiclemanager.run(current_account);
        }
      } else if (selectNo == 4) { // 로그아웃
        current_account = null;
        System.out.println("로그아웃 되었습니다.");
      } else if (selectNo == 5) { // 종료
        System.out.println("프로그램을 종료합니다.");
        break;
      }
    }
  }
}
