package oops;

abstract class Animal{
    void eat(){
        System.out.println("Animal Eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Kangaroo extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}

public class AbstractClass {
    public static void main(String args[]){
        Animal h = new Horse();
        h.eat();
        h.walk();

        Animal k = new Kangaroo();
        k.eat();
        k.walk();
    }
}
