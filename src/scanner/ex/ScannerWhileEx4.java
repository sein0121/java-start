package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int total=0;
        while(true){
            int option = scanner.nextInt();
            if (option == 1) {
                scanner.nextLine();

                System.out.print("상품명을 입력하세요: ");
                String product = scanner.nextLine();
                System.out.print("상품의 가격을 입력하세요: ");
                int price = scanner.nextInt();
                System.out.print("구매 수량을 입력하세요: ");
                int quantity = scanner.nextInt();
                total = price * quantity;

                System.out.println("상품명:" + product + " 가격:" + price + " 수량:" + quantity + " 합계:" + total);

            } else if (option == 2) {
                System.out.println("총 비용 : " + total);
                total = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션 값을 입력해주세요.");
            }
        }
    }
}
