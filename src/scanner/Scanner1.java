package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열을 입력하세요 : ");
        String str = scanner.nextLine();
        System.out.println("입력한 문자열 : "+str);

        System.out.println("정수를 입력하세요 : ");
        int intV = scanner.nextInt();
        System.out.println("입력한 정수 : "+intV);

        System.out.println("실수를 입력하세요 : ");
        double doubleV = scanner.nextDouble();
        System.out.println("입력한 실수 : "+doubleV);
    }
}
