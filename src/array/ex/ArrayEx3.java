package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5] ;
        for(int i = 0; i< arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("기존 배열 : ");
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
            if(i< arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.print("역순 배열 : ");
        for(int i =arr.length-1; i>=0 ;i--){
            System.out.print(arr[i]);
            if(i>0){
                System.out.print(",");
            }
        }
    }
}
