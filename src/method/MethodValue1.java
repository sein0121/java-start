package method;

public class MethodValue1 {
    public static void main(String[] args) {
        int num1 =5;
        System.out.println("1. changeNum 호출 전, num1 : "+num1);
        changeNum(num1);
        System.out.println("4. changeNum 호출 후, num1 : "+num1);
    }
    public static void changeNum(int num2){
        System.out.println("2. changeNym 변경 전, num2 : "+num2);
        num2 *= 2;
        System.out.println("3. changeNym 변경 후, num2 : "+num2);
    }
}
