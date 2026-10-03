package Practice;
public class oops {
    public static void main (String[] args){

        classTeacher ct1 = new classTeacher();
        ct1.markattendance();
        ct1.displaydetails(ct1.name, ct1.age, ct1.empid, ct1.subject);

        classTeacher ct2 = new classTeacher();
        ct2.displaydetails(ct2.name, ct2.age, ct2.empid, ct2.subject);

        classTeacher ct3 = new classTeacher("Ms. Johnson");
        ct3.displaydetails(ct3.name, ct3.age, ct3.empid, ct3.subject);
        
    }
    
}
class student{
    //characteristics
    String name;
    int age;
    int rollno;
    //behaviors
    void markattendance(){
        System.out.println("Attendance marked");
    }
    void displaydetails(String name, int age, int rollno){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollno);
    }
}
class teacher{
    String name;
    int age;
    int empid;
    void markattendance(){
        System.out.println("Attendance marked");
    }
    void displaydetails(String name, int age, int empid){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empid);
    }
}

//Inheritance of classTeacher from teacher class:
class classTeacher extends teacher{
    String subject;
    void displaydetails(String name, int age, int empid, String subject){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empid);
        System.out.println("Subject: " + subject);
    }
    //constructor chaining
    classTeacher(){
        this("Unknown", 0, 0, "Unknown");
    }
    classTeacher(String name){
        this(name , 0, 0, "Unknown");
    }
    classTeacher(String name, int age){
        this(name , age, 0, "Unknown");
    }
    classTeacher(String name, int age, int empid){
        this(name , age, empid, "Unknown");
    }
    classTeacher(String name, int age, int empid, String subject){
        this.name = name;
        this.age = age;
        this.empid = empid;
        this.subject = subject;
    }
}
