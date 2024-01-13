package 추상클래스;

public class Dog extends Animal{

    @Override
    void crying() {
        System.out.println("멍! 멍!");
    }

    @Override
    void tail() {
        System.out.println("꼬리를 흔듭니다.");

    }
}
