package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5] ;
        int sum =0;

        for(int i = 0; i< arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        for (int i=0; i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("합 : " + sum);
        System.out.println("평균 : "+ (double)sum / arr.length );

    }
}
