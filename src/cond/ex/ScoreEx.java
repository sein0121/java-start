package cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 78;
        String grade ;

        if(score >= 90) grade = "A";
        else if (score>=80 && score<90) grade = "B";
        else if (score>=70 && score<80) grade = "C";
        else if (score>=60 && score<70) grade = "D";
        else grade= "D";

        System.out.println("score : " +score);
        System.out.println("학점은 " + grade + "입니다.");

        //풀이
//        if (score >= 90) {
//            System.out.println("학점은 A입니다.");
//        } else if (score >= 80) {
//            System.out.println("학점은 B입니다.");
//        } else if (score >= 70) {
//            System.out.println("학점은 C입니다.");
//        } else if (score >= 60) {
//            System.out.println("학점은 D입니다.");
//        } else {
//            System.out.println("학점은 F입니다.");
//        }
    }
}
