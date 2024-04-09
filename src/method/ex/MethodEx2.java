package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
       comment(3);
        System.out.println("----");
       comment(5);
        System.out.println("----");
       comment(7);
    }

    public static void comment(int num){
        String message = "Hello, world!";
        for(int i =0; i<num; i++){
            System.out.println(message);
        }
    }
//
//    public static void printMessage(String message, int times) {
//        for (int i = 0; i < times; i++) {
//            System.out.println(message);
//        }
//    }
}
