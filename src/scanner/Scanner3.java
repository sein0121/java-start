package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("num1이 더 크다.");
        }
        else if(num2 > num1){
            System.out.println("num2이 더 크다.");
        }else if(num2 == num1){
            System.out.println(" 두수가 같다.");
        }
    }
}
