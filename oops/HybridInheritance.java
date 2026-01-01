package oops;

interface Pet{
    void play();
}

class Animal{
    void eat(){
        System.out.println("Animal Eats");
    }
}

class Dog extends Animal implements Pet{
        void bark(){
        System.out.println("Dog Barks");
    }

    public void play(){
        System.out.println("Dog Plays");
    }
}

public class HybridInheritance {
    public static void main(String args[]){
        Dog d = new Dog();
        d.play();
        d.bark();
        d.eat();
    }
}
