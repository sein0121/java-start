package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum =0;

        while(true){
            int num = scanner.nextInt();
            if(num==0){
                break;
            }else {
                sum = sum + num;
            }
        }
        System.out.println(sum);
    }
}
