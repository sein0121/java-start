package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       while(true){
           String name = scanner.nextLine();

           if(name.equals("종료")){
               System.out.println("프로그램을 종료합니다.");
               break;
           }
           int age = scanner.nextInt();
           scanner.nextLine();
           System.out.println("이름 : "+ name + " 나이 : "+ age);

       }
    }
}
