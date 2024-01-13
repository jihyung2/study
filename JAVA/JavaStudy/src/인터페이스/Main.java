package 인터페이스;
//추상클래스보다 인터페이스를 실제적으로 더 많이 사용함, 인터페이스는 설계만 가능함
// 인터페이스와 추상클래스의 차이를 기업에서 물어보는게 많으니 정리하는게 좋아보임
public class Main implements Cat, Dog {
    public static void main(String[] args){
        Main main = new Main();
        main.crying();
        main.one();
        main.two();

    }
    @Override
    public void crying() {
        System.out.println("월월 냐아옹");
    }
    @Override
    public void one() {
        System.out.println("1111");
    }
    @Override
    public void two() {
        System.out.println("22222");
    }
}
