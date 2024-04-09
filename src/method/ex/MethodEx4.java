package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 0;

        while(true){
            System.out.print("선택 : ");
            int option = input.nextInt();

//            if(option==1){
//                System.out.print("입금액 : ");
//                int depositamount = input.nextInt();
//                balance = deposit(balance,depositamount);
//            } else if (option ==2) {
//                System.out.print("출금액 : ");
//                int withdrawAmount = input.nextInt();
//                balance = withdraw(balance,withdrawAmount);
//            } else if (option ==3) {
//                System.out.println("현재 잔액 : " +balance);
//            } else if (option==4) {
//                System.out.println("시스템을 종료합니다.");
//                break;
//            }

            int amount;
            switch (option){
                case 1 :
                    System.out.print("입금액 : ");
                    amount = input.nextInt();
                    balance = deposit(balance,amount);
                    break;
                case 2 :
                    System.out.print("입금액 : ");
                    amount = input.nextInt();
                    balance = withdraw(balance,amount);
                    break;
                case 3:
                    System.out.println("현재 잔액: " + balance + "원");
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }

    }
    public static int deposit(int balance,int amount){
        balance+=amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance
                + "원");
        return balance;
    }
    public static int withdraw(int balance,int amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " +
                    balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
