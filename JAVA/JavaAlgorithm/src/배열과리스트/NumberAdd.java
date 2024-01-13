package 배열과리스트;

import java.util.Scanner;

public class NumberAdd {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("N의 값을 입력해주세요");
        //숫자의 개수 100개 이하
        int N = scanner.nextInt();
        // 공백없이 주어진 N개의 문자
        String number = scanner.next();

        //공백없이 주어진 N개의 문자를 다 더하는 문제
        char[] num = number.toCharArray();
        int sum = 0;
        for (int i = 0 ; i<num.length ; i ++){
            sum = sum + num[i] - 48;
            // - 48 대신 '0'을 빼도 문자열로 변경이 가능해짐
        }
        System.out.println(sum);

    }
}
