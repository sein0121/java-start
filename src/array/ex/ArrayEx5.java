package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수 : ");
        int count = scanner.nextInt();

        int[] arr = new int[count] ;

        for(int i = 0; i< arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int i =0;i< arr.length;i++){
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);

    }
}
