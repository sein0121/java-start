package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       while(true){
           int price = scanner.nextInt();

           if(price==-1){
               System.out.println("프로그램을 종료합니다.");
               break;
           }
           int quantity = scanner.nextInt();
           int sum = price*quantity;
           System.out.println("총비용 : "+ sum );

       }
    }
}
