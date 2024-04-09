package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            if (i == 3) {
                i++;
                continue; // i를 하나 증가하고 continue, sout 실행하지 않고 바로 while문으로 이동
            }
            System.out.println(i);
            i++;
        }
    }
}
