package 배열과리스트;

import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("시험을 본 과목의 갯수를 적어주세요");
        int N  = scanner.nextInt();
        int max = 0;
        int min = 0;
        //**int a의 배열을 만드는 방법**
        int a[] = new int[N];

        for (int i = 0 ; i<N; i++) {
            System.out.println("시험의 점수들을 적어주세요");
            int grade = scanner.nextInt();
            a[i] = grade;
        }
        //최대값 구하는 방법
        //내가 해결한 방법은 배열을 오름차순으로 나누고 했지만, 사실 오름차순으로 나눌필요없이 가장 높은 값 하나만 저장하면 되는 문제였음

        // 시간초과를 생각하면 시간복잡도를 생각해서 작성하는게 가장 좋은 코딩임
        // 내가한방식은 전체하나를 구하는게 아니라 각각의 평균을 구하고 더하는 방식, 비효율적임
        for(int i = 0; i<N; i++) {
            for (int j = 0; j < N; j++) {
                if (a[i] > a[j]) {

                } else {
                    int p = a[j];
                    a[j] = a[i];
                    a[i] = p;
                }
            }
        }
        double p = 0;
        double fi[] = new double[N];
        for(int i = 0; i<N; i++) {
            fi[i] = (a[i]*100)/a[N-1];
        }
        for(int i = 0; i<N; i++) {
            p = p + fi[i];
        }
        double grade = p/N;
        System.out.println(grade);
    }
}
