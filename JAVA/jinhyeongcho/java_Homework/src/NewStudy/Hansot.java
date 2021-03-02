package NewStudy;

public class Hansot {
    // 배달 도시락을 주문하는데 10개까지는 개당 5000원이고 10개 초과하는 양에 대해서는 개당 4800원이다.
    //배달 도시락의 주문갯수를 입력받아서 전체금액을 계산하는 프로그램을 작성하시오.
    int sum;
    public Hansot(int ea) {
        if(ea <=10){
            sum = ea*5000;
            System.out.println("도시락은 총 " +ea + "개입니다.");
            System.out.println("총금액은: " + sum +"원입니다.");
        } else if (ea >10){
            sum = ((ea-10)*4800)+50000;
            System.out.println("도시락은 총 " +ea + "개입니다.");
            System.out.println("총금액은: " + sum +"원입니다.");
        }
    }
}
