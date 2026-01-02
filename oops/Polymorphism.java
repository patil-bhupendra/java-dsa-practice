package oops;

class Animal{
    void sound(){
        System.out.println("Animal Sounds");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}

public class Polymorphism {
    public static void main(String args[]){
        Animal a = new Dog();
        a.sound();
    }
}
