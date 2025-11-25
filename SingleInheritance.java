public class Main {
    public static void main(String[] args) {
        Box box = new Box();


        BoxWeight box2 = new BoxWeight(1,2,3,5);
        System.out.println(box2.l+" "+box2.h+" "+box2.w+" "+box2.weight);
//        System.out.println(box.l);
//        System.out.println(box.h);
//        System.out.println(box.w);
    }
}
class Box {
    double l;
    double h;
    double w;

    Box(){
        super();
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;

    }

    Box(double l,double h,double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
}
class BoxWeight extends Box {
    double weight;

    BoxWeight(double l,double h, double w, double weight){
        super(l,h,w);

        this.weight = weight;
    }
}