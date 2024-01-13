package 상속;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("총 몇명의 학생이 있나요?");
        int number = scan.nextInt();
        Student[] students = new Student[number];
        for(int i = 0; i<number; i++){
            String name;
            int age;
            int height;
            int weight;
            String studentID;
            int grade;
            double GPA;

            System.out.println("학생의 이름은?");
            name = scan.next();
            System.out.println("학생의 나이은?");
            age = scan.nextInt();
            System.out.println("학생의 키은?");
            height = scan.nextInt();
            System.out.println("학생의 몸무게은?");
            weight = scan.nextInt();
            System.out.println("학생의 아이디는?");
            studentID = scan.next();
            System.out.println("학생의 학년은?");
            grade = scan.nextInt();
            System.out.println("학생의 학점은?");
            GPA = scan.nextDouble();

            students[i] = new Student(name, age, height, weight, studentID, grade, GPA);

        }
        System.out.println("총 몇명의 선생이 있나요?");
        int number2 = scan.nextInt();
        Teacher[] teacher = new Teacher[number2];

        for(int i = 0; i<number2; i++) {
            String name;
            int age;
            int height;
            int weight;
            String teacherID;
            int grade;
            double GPA;

            System.out.println("선생의 이름은?");
            name = scan.next();
            System.out.println("선생의 나이은?");
            age = scan.nextInt();
            System.out.println("선생의 키은?");
            height = scan.nextInt();
            System.out.println("선생의 몸무게은?");
            weight = scan.nextInt();
            System.out.println("선생의 아이디는?");
            teacherID = scan.next();
            System.out.println("선생이 맡은 학년은?");
            grade = scan.nextInt();
            System.out.println("선생의 평점은?");
            GPA = scan.nextDouble();

            teacher[i] = new Teacher(name, age, height, weight, teacherID, grade, GPA);
        }


        for (int i = 0; i<number; i++){
            students[i].show();
        }

        for (int i = 0; i<number2; i++){
            teacher[i].show();
        }


        //Student student1 = new Student("홍길동", 25,180,95,"20202021",4,4.5);
        //Student student2 = new Student("아무개", 28,160,45,"20202021",2,3.5);
        //student1.show();
        //student2.show();

        //Teacher teacher = new Teacher("김선생", 35,180,105,"199199",2,4.5);
        //teacher.show();

    }
}
