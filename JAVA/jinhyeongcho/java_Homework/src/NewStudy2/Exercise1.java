package NewStudy2;

public class Exercise1 {
    //1+(1+2)+(1+2+3)+(1+2+3+4)....(1+...+10)의 합계를 구하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        int total;
        for(int i =0;i<=10;i++){
            num = num+i;
            sum = sum + num;
            System.out.println("토탈" + sum);
        }
    }
}
