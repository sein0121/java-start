package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum =0;

        for (int i=0; ;i++){
            sum +=i;
            if(sum>10){
                System.out.println("10보다 큼 : "+ i + "  sum : "+sum);
                break;
            }
        }
    }
}
