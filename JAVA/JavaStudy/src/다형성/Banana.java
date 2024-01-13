package 다형성;

public class Banana extends Fruit{
    //void를 사용하면 값이 나오지 않음, void는 반환하는 값이 있을때만 사용함
    //Fruit의 자식으로, 값을 반환하지 않고 Fruit의 값을 넣기위해 사용하는 클래스 이므로 초기화를 저렇게 해주는 것 같음
    //이런식으로 만드는 것을 생성자라고 함. 생성자는 반환값을 가지지 않고, 클래스 이름과 같다는 특징이 있음
    //클래스의 인스턴스를 초기화할 때 사용한다.
    public Banana(){
        price = 2500;
        name = "바나나";
        fresh = 55;
    }
}
