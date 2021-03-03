package NewStudy2;

public class Exercise3 {
    //int 타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 프로그램을 작성하시오.
    //예를들면 변수 num의 값이 12345
    public static void main(String[] args) {
        int num = 12345;

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
            //System.out.println("num=" + num);
        }
        System.out.println("sum=" + sum);
    }
}

