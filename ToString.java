public class Object {

    int num;

    Object(int num){
        this.num = num;
    }

    @Override
    public String toString() {
        return "Object{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        Object obj = new Object(55);
        System.out.println(obj);
    }
}
