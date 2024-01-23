import java.util.*;

public class java14_3 {
    public static void main(String[] args){
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";

        Map<String, Integer> dataset = new HashMap<>();
        dataset.put("code", 0);
        dataset.put("date", 1);
        dataset.put("maximum", 2);
        dataset.put("remain", 3);


        List<int[]> answer = new ArrayList<>(); // 배열로 인자값을 받을 거라 이렇게 작성
        for (int[] d : data ){
            if (d[dataset.get(ext)]<val_ext){ // 이렇게하면 1. Map에 들어있는 내용으로 값을 가져옴 ex) 만약 ext가 code면 0 이런식으로 값을 가져온 후
                // 배열하나가 통으로 들어오기 때문에 값 하나를 비교할 수 있음
                // 쉽게 생각한다면 ext가 date가 들어오면 dataset.get(exp)로 1이 나오고 d[1]은 현재 배열의 date 값을 나타내기 때문에 val_ext와 비교를 해서 조건에 맞는 배열값을 저장할 수 있다.
                answer.add(d); // 이렇게 하면 답을 출력할 새로운 리스트에 배열을 추가한다. 쉽게 생각하면 1차원 리스트를 만들고 그 안에 배열 하나가 통으로 들어있는 것임
            }
            answer.sort(Comparator.comparingInt(x -> x[dataset.get(sort_by)]));
        }// 리스트에서도 sort를 지원함, sort_by에 해당하는 값을 기준으로 오름차순

        System.out.println(answer.toArray(new int[0][]));
        //List를 배열로 변환하여 반환
    }



    }
//    class Solution {
//        public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
//
//
//            Map<String, Integer> dataset = new HashMap<>();
//            dataset.put("code", 0);
//            dataset.put("date", 1);
//            dataset.put("maximum", 2);
//            dataset.put("remain", 3);
//
//            List<int[]> answer = new ArrayList<>();
//            for (int[] d : data ){
//                if (d[dataset.get(ext)]<val_ext){ // 이렇게하면 1. Map에 들어있는 내용으로 값을 가져옴 ex) 만약 ext가 code면 0 이런식으로 값을 가져온 후
//                    // 배열하나가 통으로 들어오기 때문에 값 하나를 비교할 수 있음
//                    // 쉽게 생각한다면 ext가 date가 들어오면 dataset.get(exp)로 1이 나오고 d[1]은 현재 배열의 date 값을 나타내기 때문에 val_ext와 비교를 해서 조건에 맞는 배열값을 저장할 수 있다.
//                    answer.add(d); // 이렇게 하면 답을 출력할 새로운 리스트에 배열을 추가한다. 쉽게 생각하면 1차원 리스트를 만들고 그 안에 배열 하나가 통으로 들어있는 것임
//                }
//                answer.sort(Comparator.comparingInt(x -> x[dataset.get(sort_by)]));
//            }// 리스트에서도 sort를 지원함, sort_by에 해당하는 값을 기준으로 오름차순
//
//            return answer.toArray(new int[0][]);
//            //List를 배열로 변환하여 반환
//        }
//       }
//    }
    //data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후, sort_by에 해당하는 값을 기준으로 오름차순으로 정렬하여 return 하도록 solution 함수를 완성해 주세요.
    class Solution2 {
        // 최초로 사용할 때는 너무 돌아가는 방식으로 Array 만을 사용해서 해결한듯, 너무 비효율적인 구조로 생각이됨
        public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
            int[][] answer = {};
            int a = data.length;
            int[] codeba = new int[a];
            int[] dateba = new int[a];
            int[] maxba = new int[a];
            int[] remainba = new int[a];


            for (int j = 0; j<a; j++) {
                for (int i = 0; i < 4; i++) {
                    if (i == 0){
                       codeba[j] = data[j][i];
                    } else if (i == 1){
                        dateba[j] = data[j][i];
                    } else if (i == 2){
                        maxba[j] = data[j][i];
                    } else if (i == 3){
                        remainba[j] = data[j][i];
                    }
                }
            }

            if (ext.equals("date")){

            }

            return answer;
        }
    }


