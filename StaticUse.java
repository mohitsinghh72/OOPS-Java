public class StaticUse {
    public static void main(String[] args) {
        Human human = new Human(23,"James",330000,false);
        Human human2 = new Human(23,"James",330000,false);
        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
class Human {
    int age;
    int salary;
    boolean married;
    String name;
    static long population;             //static variable does not depend on objects

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population++;

    }
}