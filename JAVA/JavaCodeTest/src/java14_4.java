import java.util.ArrayList;
import java.util.List;


// 배열은 순서가 없기 때문에 List로 변환해서 문제를 풀어야겠다고 생각
// Key value가 없기때문에 Map 사용 x
// 조건을 보면 1 2 3 1 이 나와야 한개의 햄버거가 되고 그 내용을 빼고
// 반복해서 작동시키면 될거같다는 생각을 함
public class java14_4 {
    public static void main(String[] args){
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int answer = 0;
        // 1 빵, 2 야채, 3 고기
        // 순서대로 빵 야채 고기 빵 순서대로 해야 하나의 햄버거 완성
        // 햄버거 완성 안되면 없다고 출력하기
        List<Integer> hamberger = new ArrayList<>();
        for (int d : ingredient){
            hamberger.add(d);
            //1. list를 생성후 ingredient의 길이만큼 반복문을 돌며 값을 하나씩 넣는다.
            //
            //2. 값을 넣으면서 길이가 4이상 일때 뒤쪽에서부터 4개의 값을 1,2,3,1인지 확인
            //
            //3. 확인후 1,2,3,1이 차례대로 들어와있다면 answer값을 증가시킨후 해당 값들 삭제
            if(hamberger.size() >=4 &&
                    hamberger.get(hamberger.size()-4) == 1 &&
                    hamberger.get(hamberger.size()-3) == 2 &&
                    hamberger.get(hamberger.size()-2) == 3 &&
                    hamberger.get(hamberger.size()-1) == 1){
                answer++;
                for(int j=0;j<4;j++){
                    hamberger.remove(hamberger.size()-1);
                }
            }
        }
        System.out.println(answer);
    }
}
