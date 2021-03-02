package NewStudy;

public class Horse {
    public Horse(int min) {
        if (min <=30){
            System.out.println("지불금액은 3000원입니다.");
        }
        else if (min >30){
            int sum = (((min - 30) / 10)+1) * 500 + 3000;
            System.out.println("총 "+ sum + "원입니다");
        }

    }
}
