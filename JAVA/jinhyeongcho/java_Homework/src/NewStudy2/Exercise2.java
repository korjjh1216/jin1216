package NewStudy2;

import java.util.Scanner;

public class Exercise2 {
    //숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 프로그램을 작성하시오.
    //예를들면 문자열이 "12345"라면 1+2+3+4+5의 결과인 15가 출력되어야 한다.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("문자열을 입력하세요 : ");
        String str = scan.next();
        //String str = "12345";
        int sum = 0;
        for(int i = 0; i<str.length();i++) {
            int aa = str.charAt(i);
            sum += aa - '0';

        }
        System.out.println(sum);
    }
}
