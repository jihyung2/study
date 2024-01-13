package 시간복잡도;

public class Time_Complexity_N {
    public static void main(String[] args){
        int N = 100000;
        int count=0;
        // 연산 횟수는 N이다. 아래 for문에서 100,000번 실행되기 때문
        // 시간복잡도는 N이다.
        for (int i =0; i<N; i++){
            System.out.println("연산 횟수는 : "+ count++);
        }

        //만약 이중 for문이라면 시간복잡도는 N^2가 된다.
        for (int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                System.out.println("연산 횟수는 : "+ count++);
            }
        }
        //이렇게 시간복잡도가 N과 N^2이 둘다 있을경우에는 규칙 2번에 따라 중첩반복문이 더 많은 시간복잡도가 기준이 된다.
    }
}
