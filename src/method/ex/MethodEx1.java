package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        double average = avg(1,2,3);
        System.out.println("평균값: " + average);

        System.out.println("평균값: " + avg(15,25,35));
    }

    public static double avg(int a, int b, int c){
        int sum = a+b+c;
        double average = sum / 3.0;
        return average;
    }
}
