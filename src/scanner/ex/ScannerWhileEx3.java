package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int sum =0;
        double average=0;
        int count =0;

       while(true){
           int num = scanner.nextInt();

           if(num==-1) {
               System.out.println("프로그램을 종료합니다.");
               break;
           }
           sum += num;
           count ++;

       }
        average = (double) sum / count;
        System.out.println("sum : "+sum +" average : "+average);
    }
}
