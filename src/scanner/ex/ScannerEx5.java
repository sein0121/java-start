package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(num1 > num2){
            int temp;
            temp = num1;
            num1 =num2;
            num2 = temp;
        }

        for( int i = num1; i<=num2; i++){
            System.out.print(i);
            if(i!=num2){
                System.out.print(",");
            }
        }
    }
}
