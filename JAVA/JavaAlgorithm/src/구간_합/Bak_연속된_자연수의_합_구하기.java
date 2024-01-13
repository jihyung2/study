package 구간_합;

import java.util.Scanner;

//N의 범위가 매우 크면, 투 포인터 방법을 사용해서 해결해야한다.
//nlogn 시간복잡도를 사용하면 제한 시간을 초과하기 때문이다.
public class Bak_연속된_자연수의_합_구하기 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
// count를 1로 초기화 하는 이유는 N을 15라고 했을때 맨마지막 15가 나오면 자기자신이 같아서 나오는 경우의 수를 미리 넣고 초기화함
// sum을 1로 초기화 하는 이유는 시작이 1부터 시작하기 때문이다.
        int sum = 1;
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        //for문 외에도 while문을 고려하기,
        while(end_index != N){
            if (sum > N){
                sum = sum - start_index;
                start_index++;
            }
            else if (sum < N) {
                end_index++;
                sum = sum + end_index;
            }
            else if (sum == N) {
                end_index++;
                sum=sum + end_index;
                count++;
            }
        }

        System.out.println(count);

    }

}
