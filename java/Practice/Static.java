package Practice;
public class Static {
    public static void main(String[] args){
        student s1 = new student("John", 20, 101);
        student s2 = new student("Alice", 21, 102);
        System.out.println(s1.name + " " + s1.age + " " + s1.rollno + " " + student.college);
        System.out.println(s2.name + " " + s2.age + " " + s2.rollno + " " + student.college);
    }
}
class student {
    String name;
    int age;
    int rollno;
    static String college;

    student(String name, int age, int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    } 
    //static block is used to initialize static variables
    static {
        college = "XYZ College";
    }
}
