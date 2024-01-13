package 구간_합;

import java.util.Arrays;
import java.util.Scanner;

public class Bak_주몽의_명령 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] a = new int[N];

        for (int i = 0; i<N; i++){
            int NM = scanner.nextInt();
            a[i] = NM;
        }
        //Arrays.sort()을 사용하면 한번에 오름차순 정렬할 수 있다. 굳이 이중 for문을 사용하지 말고 정렬해서 사용하자.
        // sort는 정렬함수고, Array(배열).sort(정렬)을 사용하자.
        Arrays.sort(a);
        //이 문제도 2포인터로 해결해야함, 왜냐하면 필요한 수의 숫자가 천만개 까지 있기때문에, 시간 초과가 날 수도 있음
        // 이 문제는 투포인터 이동방식으로 해결하되, 문제를 읽어보면 2개씩만 해야 하므로 연속된 자연수의 합 구하는 방식으로 풀면 안된다.
        // 1. 문제를 오름차순 정렬하기 2. 양 끝쪽에 있는 값을 더하고 M보다 작으면 왼쪽(min)값을 한칸 올리고, M보다 크면 오른쪽(Max)값을 한칸 낮춘다.
        // 그렇게 해서 한칸한칸 옮기다 M과 같아지면 count를 하나 추가하고, 둘다 가운데로 한칸씩 이동한다.
        // 시작지점은 배열의 0과 끝지점은 N-1이다.
        int start_index = 0;
        int end_index = N-1;
        int count = 0;
        while(start_index < end_index){
            if (a[start_index] + a[end_index] < M){
                start_index++;
            }
            else if (a[start_index] + a[end_index] > M) {
                end_index--;
            }
            else if (a[start_index] + a[end_index] == M) {
                count++;
                start_index++;
                end_index--;
            }
        }
        System.out.println(count);


    }
}
