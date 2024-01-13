package 구간_합;

// 슬라이딩 윈도우 알고리즘은 2개의 포인터로 범위를 지정한 다음 범위를 유지한 채로 이동하여 문제를 해결한다.
// 슬라이딩 윈도우 = 크기를 유지하면서 한칸씩 옮겨서 넣어보는것을 의미
// 슬라이딩 윈도우의 시간복잡도 = O(n)

import java.util.Scanner;

// 제한시간 2초, 2억번의 계산안에 끝내야함, 시간복잡도 먼져 따져보기

public class Bak_DNA비밀번호 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String[] DNA = new String[N];
        for(int i = 0; i<N; i++) {
            DNA[i] = scanner.next();
        }
        int[] min = new int[4];

        for(int i = 0; i<4; i++){
            min[i] = scanner.nextInt();
        }
        int sliding_window = N - M + 1;

        for (int i = 0; i<sliding_window; i++){

        }
    }
}
