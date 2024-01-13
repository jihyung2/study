package 상속;

public class Teacher extends Person {
    private String teacherID;
    private int grade;
    private double GPA;

    public String getTeacherID(){
        return teacherID;
    }
    public void setTeacherID(String teacherID){
        this.teacherID = teacherID;
    }
    public int getGrade(){
        return grade;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public double getGPA(){
        return GPA;
    }
    public void setGPA(double GPA){
        this.GPA = GPA;
    }


    public Teacher(String name, int age, int height, int weight, String teacherID, int grade, double GPA) {
        super(name, age, height, weight);
        this.teacherID = teacherID;
        this.grade = grade;
        this.GPA = GPA;
    }

    public void show(){
        System.out.println("----------------------");
        System.out.println("선생 이름 : " + getName());
        System.out.println("선생 나이 : " + getAge());
        System.out.println("선생 키 : " +getWeight());
        System.out.println("선생 몸무게 : " +getHeight());
        System.out.println("선생 아이디: " +getTeacherID());
        System.out.println("선생 맡은 반 : " +getGrade());
        System.out.println("선생 평점 : " +getGPA());

    }
}
