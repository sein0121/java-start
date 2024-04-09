package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String foodName = scanner.nextLine();
        int foodPrice = scanner.nextInt();
        int foodQuantity = scanner.nextInt();

        int sum = foodPrice * foodQuantity;

        System.out.println(foodName + " " + foodQuantity+"개를 주문하셨습니다.");
        System.out.println("총 가격은 "+ sum +"원 입니다.");

    }
}
