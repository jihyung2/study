package 클래스;

public class Main {
    public static void main(String[] args){
        Node one = new Node(10, 30);
        Node two = new Node(20, 60);
        Node result = one.getCenter(two);
        System.out.println("x : " +result.getX() + " y : "+result.getY());
    }
}