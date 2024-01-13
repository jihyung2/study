BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 사용자로부터 입력값을 받음 BufferdReader과 InputStreamReader(System.in)는 함께 사용
StringTokenizer st = new StringTokenizer(bf.readLine()); // 사용자로부터 입력받은 값을 한줄만 입력받음 BufferdReader, InputStreamReader, StringTokenizer은 세트임 같이 사용한다고 생각하는게 편함


bf.readLine() -> 사용자로부터 값 입력받기
StringTokenizer -> 입력받은 값 공백으로 나누기
st.nextToken() -> StringTokenizer로 나눈 토큰 순서
Integer.parseInt() -> 정수로 변
toCharArray() -> 배열에 저장하는 변수, 배열에 값을 그냥 넣을 수 없으므로 이러한 변수 사용

슬라이딩 윈도우 기억하기
오른쪽 끝 ADD
왼쪽 끝 Remove
하면서 왼쪽과 오른쪽 끝만 보기
원리만 다시 익히면 금방 외울듯