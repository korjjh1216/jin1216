package NewStudy.Time;

public class timeTest {
    public static void main(String[] args) {
        Time time = new Time();
        System.out.println("기본 생성자 호출 후 시간 : " + time);

        Time time1 = new Time(10,10,10);
        System.out.println("두번째 생성자 호출 후 시간 : " + time1);

        Time time2 = new Time(30,100,99);
        System.out.println("올바르지 않은 시간 설정 후 시간 : " + time2);
    }
}
