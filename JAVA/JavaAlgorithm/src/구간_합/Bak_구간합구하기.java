package 구간_합;

//1. 코테 문제 시작시, 범위 확인하기
//2. 가장 큰 데이터가 들어올 것이라 가정하고 문제풀기

// 이지형 풀이 시작
// 제한시간 0.5 초 5천만번의 계산 시간안에 풀어야함
// 범위 100,000만 시간복잡도를 계산해보면
// 2중 for문을 사용하면 시간 제한 에러에 걸림

import java.util.Scanner;

//수 N개가 주어졌을때 i번째 수에서 j번째 수 까지의 합을 구하는 프로그램 작성하기
// 1번째 줄에 수의 개수N, 합을 구해야하는 횟수M
// 2번째 줄에 N개의 수가 주어진다.
// 3번째 줄 부터는 M개의 줄에 합을 구해야 하는 구간 i와 j가 주어진다.
// 중간합 구하는 공식은 a[4]와 a[2]사이에 있는 값을 구해야 하는경우, S[4] - S[1]이다.
public class Bak_구간합구하기 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();


        int S[] = new int[N];
        for(int i = 0 ; i<N; i++) {
            int a = scanner.nextInt();
            if (i == 0) {
                S[i] = a;
            } else {
                S[i] = a + S[i - 1];
            }
        }

        for (int k = 0 ; k<M; k++){
            int j = scanner.nextInt();
            int i = scanner.nextInt();

            if (j == 1){
                int result = S[i-1];
                System.out.println(result);
            }
            else if ( i == 1) {
                int result = S[0];
                System.out.println(result);
            }
            else{
                int result = S[i-1] - S[j-2];
                System.out.println(result);
            }
        }

    }
}
