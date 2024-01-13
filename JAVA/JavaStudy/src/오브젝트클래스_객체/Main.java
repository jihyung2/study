package 오브젝트클래스_객체;
// 두 인스턴스의 내부 값이 같더라도 acher1 == acher2는 false가 나오고
// 실제 내부 값을 비교하고싶으면 equals문을 사용해서 해야한다.

public class Main {
    public static void main(String[] args){
        Acher acher1 = new Acher("궁수1", "상");
        Acher acher2 = new Acher("궁수1", "상");
        System.out.println(acher1 == acher2);
        System.out.println(acher1.equals(acher2));
    }
}
