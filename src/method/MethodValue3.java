package method;

public class MethodValue3 {
    public static void main(String[] args) {
        int num =5;
        System.out.println("1. changeNum 호출 전, num1 : "+num);
        num = changeNum(num);
        System.out.println("2. changeNum 호출 후, num1 : "+num);
    }
    public static int changeNum(int num){
        num *= 2;
        return num;
    }
}
