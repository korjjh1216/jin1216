package NewStudy2;

import java.util.Scanner;

public class Exercise5 {
    //변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
    // 단 가능한 적은 수의 동적으로 거슬러 주어야한다.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("money를 입력해라.");
        int money = scan.nextInt();
        System.out.println(money+"원");

        int coin500;
        int coin100;
        int coin50;
        int coin10;
        coin500 = money / 500;
        coin100 = (money % 500)/100;
        coin50 = (money % 500)%100/50;
        coin10 = (money % 500)%100%50/10;
        System.out.printf("500원 동전수= "+ coin500+"\n");
        System.out.printf("100원 동전수= "+ coin100+"\n");
        System.out.printf("50원 동전수= "+ coin50+"\n");
        System.out.printf("10원 동전수= "+ coin10);
    }
}
