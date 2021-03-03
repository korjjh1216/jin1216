package NewStudy2;


public class Exercise6 {
    //아래와 같이 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 '*'을
    //찍어서 아래 그림처럼  출력하는 프로그램을 작성하시오.
    public static void main(String[] args) {
        int [] answer = {1,4,4,3,1,4,4,2,1,3,2};
        int  count = 0;
        for (int i = 0;i<answer.length;i++){
            for (int j=1;j<5;j++){
                if(answer[i]==j){
                    count++;
                }
                System.out.println(count);
            }
        }

    }
}
