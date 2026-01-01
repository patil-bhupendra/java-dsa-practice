package oops;

class Pen{
    int price;

    Pen(int price){
        this.price = price;
    }
}

public class ShallowAndDeepCopy {
    public static void main(String args[]){
        Pen p1 = new Pen(10);
        Pen p2 = p1;
        Pen p3 = new Pen(p1.price);
        p2.price = 30;

        System.out.println(p1.price);
        System.out.println("Shallow Copy" + " " + p2.price);
        System.out.println("Deep Copy" +  " " + p3.price);
    }
}
