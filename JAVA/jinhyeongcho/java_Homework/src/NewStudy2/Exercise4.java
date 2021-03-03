package NewStudy2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    //사용자로부터 값을 받아서 5명의 성적을 배열에 채운 후에 배열을 매개변수로 받는 메소드를 작성하여
    //배열에 저장된 모든 값의 평균을 구하는 프로그램을 작성하시오.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("입력해라.");
        int [] score  = new int[5];
        int sum = 0;
        float avg;
        for (int i= 0;i<score.length;i++){
            score[i] = scan.nextInt();
        }
        System.out.println("각 점수들 = "+Arrays.toString(score));
        for (int i= 0;i<score.length;i++){
            sum += score[i];
        }
        avg = sum/5;
        System.out.println("평균은? " + avg);
    }
}
