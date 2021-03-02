package NewStudy;

public class newExercise2 {
    public static void main(String[] args) {
        //임의의 숫자로 로또 번호 6개를 출력하는 프로그램을 작성하시오.
        int [] number =new int[6];
        for (int i= 0; i<number.length;i++){
            number[i] = (int)(Math.random()*45+1);
            for (int j= 0; j<i; j++){
                if (number[j]==number[i]){
                    i--;
                    break;
                }
            }
        }
        for (int i= 0; i<number.length;i++){
            System.out.println(number[i]);
        }
    }
}
