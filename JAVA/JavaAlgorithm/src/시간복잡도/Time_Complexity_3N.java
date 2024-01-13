package 시간복잡도;

public class Time_Complexity_3N {
    public static void main(String[] args){
        int N = 100000;
        int count=0;

        // 연산 횟수는 3N이다. 아래 for문에서 100,000번 3번 실행되기 때문
        //하지만 시간복잡도는 N이다. 앞의 3은 상수로써 제거되기 때문이다. 그리고 어짜피 큰 차이가 나지 않는다.

        for (int i =0; i<N; i++){
            System.out.println("연산 횟수는 : "+ count++);
        }
        for (int i =0; i<N; i++){
            System.out.println("연산 횟수는 : "+ count++);
        }
        for (int i =0; i<N; i++){
            System.out.println("연산 횟수는 : "+ count++);
        }
    }
}
