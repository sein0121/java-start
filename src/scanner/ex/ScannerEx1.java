package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = scanner.nextInt();

        System.out.println("이름 : "+name+ " 나이 : "+age);
    }
}
