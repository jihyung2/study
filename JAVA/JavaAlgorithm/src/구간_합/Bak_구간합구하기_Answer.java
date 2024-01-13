package 구간_합;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//받는 데이터가 많을 때는 Scanner보다 BufferedReader사용하기, 더 빠르기 때문임
//숫자의 갯수가 10만개라면 한줄에 길게 데이터가 들어오기 때문에 int형으로 바꾸기 어렵기때문에 string tokenizer을 사용해서 값을 분리해서 사용한다.
//

public class Bak_구간합구하기_Answer {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int suNO = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        long[] S = new long[suNO+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 1; i<=suNO; i++){
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int q=0; q<quizNo; q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j]-S[i-1]);
        }
    }
}
