package 배열과리스트;

import java.util.Scanner;

public class AverageAnswer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = new int[N];
        for(int i=0; i<N; i++){
            A[i] = scanner.nextInt();
        }
        long max = 0;
        long sum = 0;

        //이부분에서 배열안쓰고 그냥 바로 받아서 값 넣고 해결해도됨 A[i]안하고 그냥 temp같은 변수를 넣어서 해결
        // 문제에서 원하는 내용을 빠르게 파악하는게 중요, 각각의 값을 넣고 저장하는게 중요한게 아닌 필요한 것을 나열하기
        // 1. 입력받은 값중 가장큰값 구하기 2. 전체 점수를 더하고 높은값으로 나누기

        for(int i =0; i<N; i++){
            if(A[i]>max) {
                max = A[i];
            }
            sum = sum + A[i];
        }
        System.out.println(sum*100.0/max/N);
    }
}
