import java.util.Arrays;

// 기존 아이디어 : 보트에서 가장 작은 사람 순으로 나열해서 두개를 더하고 리미트보다 작으면 한칸위로 올리는 방식 -> 비효율
// 다른 사람 아이디어 : 최소와 최대를 비교한다. 둘이 더했을때 리미트보다 높다면 최대는 혼자 타야하기 때문에 보트를 혼자태워 보내야함.
// 이점을 생각해서 위에서부터 빼면서 진행하는거임: 기억하기
// 발상의 전환인듯 굳 아이디어
public class java23_2 {
    public static void main(String[] args){
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        Arrays.sort(people);
        int answer = 0;
        int min = 0;
        int max = people.length - 1;
        while (max > min){ // 양 끝 부터 탐색 만약 조건보다 작으면 가장 큰값과 작은값을 태워 보내고, 앞으로 한칸씩 땡긴다. (가운데로)
            if ( people[max] + people[min] < limit){
                answer++;
                max--;
                min++;
            }
            else{ // 만약 최대와 최소가 크면 최대 혼자 보내고, 최소값과 그 다음 최대값 비교하는 방식
                answer++;
                max--;
            }
        }
    }
}
