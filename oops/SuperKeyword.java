package oops;

class Animal{
    Animal(){
        System.out.println("animal costructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super();
        System.out.println("horse constructor is called");
    }
}

public class SuperKeyword {
    public static void main(String args[]){
        Horse h = new Horse();
    }
}
