package NewStudy;

public class newExercise {
    //0부터 짝수를 더해서 합계가 100을 넘지 않는 마지막 짝수와 그 값까지 더한 합계를 한줄씩 출력하세요.
    public static void main(String[] args) {
        int num = 0;
        int arr = 0;
        int lastNum = 0;
        for(int i =0;i <100;i++){
            if(i % 2==0) {
                num = i;
                arr += num;
                if(arr <100){
                    lastNum = arr;
                }
            }
        }
        System.out.println("짝수의 합계 100을 넘지 않는 마지막 짝수" + lastNum);
        System.out.println(num + lastNum);
    }


}
