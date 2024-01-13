package 상속;

//공통되는 부분을 상속으로 놓고 개발하면 더 편하게 수정 및 보완이 가능하다.
public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    public Person(String name, int age, int height, int weight) {
        super();
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}
