package oops;

class Calculator{
    int add(int a, int b){
        return (a + b);
    }

    int add(int a, int b, int c){
        return(a+b+c);
    }

    double add(double a, double b){
        return(a+b);
    }
}

public class CompileTimePolymorphism {
    public static void main(String args[]){
        Calculator cal = new Calculator();
        
        System.out.println("Sum of 2 integers: " + cal.add(10,20));
        System.out.println("Sum of 3 integers: " + cal.add(10,20,30));
        System.out.println("Sum of 2 doubles: " + cal.add(2.5,3.5));
    }
}
