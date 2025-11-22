package JAVA_BASICS;


public class BasicOOPS {
    public static void main(String[] args) {
        Student s1 = new Student(12,"Elias",34.4f);
//        s1.rno = 100;
//        s1.name = "Elias";
//        s1.marks = 100.0f;
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.marks);
        System.out.println(s2.rno);
    }
}
class Student {
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("This function is in Student class");
    }

    Student(int rno,String name,float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
    Student (Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
}