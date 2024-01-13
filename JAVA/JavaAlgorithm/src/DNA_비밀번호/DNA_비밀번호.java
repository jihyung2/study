package DNA_비밀번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class DNA_비밀번호 {
    static int myArr[];
    static int checkArr[];
    static int checkSecret = 0;

    public static void main(String[] args) throws IOException{ //IOException은 입출력 예외를 처리하기 위해 선언됨
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 사용자로부터 입력값을 받음 BufferdReader과 InputStreamReader(System.in)는 함께 사용
        StringTokenizer st = new StringTokenizer(bf.readLine()); // 사용자로부터 입력받은 한줄을 가져옴(첫번째) 공백을 기준으로 문자열을 나누는 StringTokenizer객체를 생성, BufferdReader, InputStreamReader, StringTokenizer, Readline은 세트임 같이 사용한다고 생각하는게 편함
        int S = Integer.parseInt(st.nextToken()); //문자열을 StringTokenizer로 나눈후 첫 번째 토큰을 정수로 변환하여 S, 두 번째 토큰을 P에 저장한다.
        int P = Integer.parseInt(st.nextToken());
        int Result = 0;
        checkArr = new int[4];
        myArr = new int[4];
        char A[] = new char[S];

        A = bf.readLine().toCharArray(); //사용자의 입력값의 다음줄(두번째)에서 값을 읽어와 A배열에 저장
        st = new StringTokenizer(bf.readLine()); // 다음줄(세번째)에서 입력을 받아 공백을 기준으로 나누는 새로운 StringTokenizer생성
        for(int i=0; i<4; i++){
            checkArr[i] = Integer.parseInt(st.nextToken()); //다음 토큰을 읽어온후 정수로 변환하여 checkArr배열에 저장한다.
            if(checkArr[i] == 0){
                checkSecret++;
            }
        }
        for(int i=0; i<P; i++){ // 부분문자열 처음 받을때 세팅
            Add(A[i]); //A의 0번을 현재상태 배열에 넣어준다.
        }
        if(checkSecret == 4) Result++;

        //슬라이딩윈도우
        for(int i =P; i<S; i++){
            int j = i-P;
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret == 4) Result++;
        }
        System.out.println(Result);
        bf.close();
    }

    private static void Remove(char c) {
        switch (c){
            case 'A':
                if(myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'T':
                if(myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'G':
                if(myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch (c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'T':
                myArr[2]++;
                if(myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'G':
                myArr[3]++;
                if(myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }
}
