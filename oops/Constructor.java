package oops;

class Car {
    String brand;
    int speed;

    Car(String b, int s) {
        brand = b;
        speed = s;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 500);
        System.out.println(c1.brand);
        System.out.println(c1.speed);
    }
}
