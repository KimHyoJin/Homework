import java.util.HashMap;
import java.util.Scanner;

public class VehicleManager {

  private Scanner scanner;
  private HashMap<String, Vehicle> vehicleHash;

  public VehicleManager() {
    this.scanner = new Scanner(System.in);
    this.vehicleHash = new HashMap<String, Vehicle>();

  }


  public void run(Account account) {
    boolean flag = true;
    while (flag) {
      System.out.println(" --------------------------------------------- ");
      System.out.println("1. 차량추가 | 2. 차량예약 | 3. 차량목록 | 4. 예약현황 | 5.종료");
      System.out.println(" --------------------------------------------- ");
      System.out.print("선택<> ");
      int selectNo = scanner.nextInt();
      if (selectNo == 1) {
        System.out.println("--------------------");
        System.out.println("1. 택시 | 2. 버스");
        System.out.println("--------------------");
        System.out.print("선택<> ");
        int vehicleNo = scanner.nextInt();
        addVehicle(vehicleNo);
      } else if (selectNo == 2) {
        reserveVehicle(account);
      } else if (selectNo == 3) {
        vehicleList();
      } else if (selectNo == 4) {
        printSeat();
      } else if (selectNo == 5) {
        flag = false;

      }
    }
    System.out.print("프로그램을 종료합니다.");

  }


  private void addVehicle(int vehicleNo) { // 차량 추가

  }

  private void reserveVehicle(Account account) { // 차량 예약

  }


  private void vehicleList() { // 차량 목록

  }


  private void printSeat() { // 예약 현황

  }

}