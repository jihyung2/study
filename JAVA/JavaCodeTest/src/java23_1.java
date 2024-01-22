import java.util.Arrays;
import java.util.Collections;

public class java23_1 {
    public static void main(String[] args){
        String s = "-1 -2 +3 -4";
        String[] list = s.split(" "); // 숫자 앞의 공백을 제거하고 배열에 넣는거임 기억하기 split
        //Integer.parseInt()를 사용해서 문자열 배열을 정수형으로 변경 가능, 기존 배열을 사용하지말고 int 배열을 생성해서 사용하기
        int[] List = new int[list.length];

        for(int i = 0; i<list.length; i++){
            List[i] = Integer.parseInt(list[i]);
        }
        Arrays.sort(List); // 문자열 리스트 정렬하는 방식( 오른차순 )
        int min = List[0];
        int max = List[list.length - 1];
        String answer = min + " " + max;
        System.out.println(min + " " + max);
        System.out.println(Arrays.toString(List)); //배열을 출력하려면 이렇게 해야함 Arrays.toString
    }
}
