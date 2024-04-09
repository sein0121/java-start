package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 수 입력 : ");
        int count = scanner.nextInt();
        int[][] arr = new int[count][3];
        String[] sub = {"국어","영어","수학"};

        for(int row=0; row<arr.length; row++){
            System.out.println((row+1)+"번 학생의 성적을 입력하세요 : ");
            for(int col=0; col< arr[row].length;col++){
                System.out.print(sub[col]+ " : ");
                arr[row][col] = scanner.nextInt();
            }
        }

        for(int row=0; row< arr.length; row++){
            int sum =0;
            for(int col=0; col<arr[row].length;col++){
                sum += arr[row][col];
            }
            System.out.println((row+1)+ "번 학생의 총점 : "+sum);
            System.out.println((row+1)+ "번 학생의 평균 : "+ ((double)sum / sub.length));
        }

    }
}
