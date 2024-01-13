package 다형성;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("복숭아 : 1, 바나나 : 2");
        int number = scanner.nextInt();
        Fruit fruit;
        if (number == 1 ){
            fruit = new Peach();
            fruit.show();
        }
        else if (number == 2){
            fruit = new Banana();
            fruit.show();
        }

    }

}
