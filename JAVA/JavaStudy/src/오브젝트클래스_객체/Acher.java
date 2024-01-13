package 오브젝트클래스_객체;
// 모든 조상클래스는 오브젝트 클래스이다. 따로 상속을 하지 않아도 자동으로 오브젝트 클래스가 상속되어있음

public class Acher {
    String name;
    String power;

    public Acher(String name, String power){
        this.name = name;
        this.power = power;
    }
    public boolean equals(Object obj){
        //오브젝트(객체)클래스를 사용하는 경우 new를 붙이지 않고 가져올 인스턴스의 이름을 가져온다. (Acher)
        // 지금 들어온 obj를 (Acher)형태로 바꿔주는 것임
        // temp는 Acher의 형태로 바뀜
        Acher temp = (Acher) obj;
        if (name == temp.name && power == temp.power){
            return true;
        }
        else {
            return false;
        }
    }
}

//Acher temp = (Acher) obj;와 Dog dog = new Dog();는 다음과 같은 차이점이 있습니다:
//
//타입 변환:
//
//Acher temp = (Acher) obj;: 이 코드는 obj라는 변수를 Acher 타입으로 강제 변환하고, temp라는 변수에 할당하는 것을 의미합니다. 이는 obj가 Acher 클래스의 인스턴스인지 확인하고, 해당 타입으로 변환하여 사용하려는 경우에 사용됩니다. 만약 obj가 Acher 클래스의 인스턴스가 아닌 경우, ClassCastException이 발생할 수 있습니다.
//Dog dog = new Dog();: 이 코드는 Dog 클래스의 인스턴스를 생성하고, dog라는 변수에 할당하는 것을 의미합니다. 이는 Dog 클래스의 객체를 생성하여 dog 변수에 참조를 할당하는 것입니다.
//객체 생성:
//
//Acher temp = (Acher) obj;: 이 코드는 기존에 존재하는 obj 객체를 Acher 클래스의 인스턴스로 변환하고, 그 결과를 temp 변수에 할당합니다. 즉, obj는 이미 생성된 객체일 것이며, 이를 Acher 클래스의 인스턴스로 사용하고자 할 때 타입 변환을 수행합니다.
//Dog dog = new Dog();: 이 코드는 Dog 클래스의 새로운 인스턴스를 생성하고, 그 결과를 dog 변수에 할당합니다. new Dog()는 Dog 클래스의 생성자를 호출하여 새로운 객체를 만드는 역할을 합니다.
//타입 제약:
//
//Acher temp = (Acher) obj;: 이 코드는 obj가 Acher 클래스의 인스턴스 또는 Acher 클래스의 하위 클래스의 인스턴스인지 확인하고, 해당 타입으로 변환합니다. 이는 상속 관계에서 부모 클래스 타입의 변수에 자식 클래스의 객체를 할당하기 위해 사용됩니다.
//Dog dog = new Dog();: 이 코드는 Dog 클래스의 인스턴스를 생성하여 dog 변수에 할당합니다. 이는 Dog 클래스에 대한 객체를 생성하고, 이 객체를 dog 변수에 참조로 저장하는 것입니다.

//따라서, Acher temp = (Acher) obj;는 객체 타입 변환과 기존 객체를 활용한 작업에 사용되고, Dog dog = new Dog();는 새로운 Dog 클래스의 객체를 생성하는 데 사용됩니다.
//