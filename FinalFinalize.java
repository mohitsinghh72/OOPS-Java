public class FinalFinalize {
    public static void main(String[] args) {
        final Student s1 = new Student(100,"Sarada",99.99f);
        s1.name =  "eve";                       // final can be change in non-primitive datatype but not for primitive datatype.
        Student A;
        for(int i = 0 ; i<1000000;i++){
            A = new Student(12,"David",33.33f);
        }

    }
}
class A{
    final int num = 10;  // final value cannot be modified in the future, always initiate final value.
}
class Student{
    int rno;
    String name;
    float marks;

    Student(int rno,String name,float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}