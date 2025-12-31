package oops;

class Employee{
    String name;
    int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    Employee(Employee e){
        this.name = e.name;
        this.salary = e.salary;
    }
}

public class CopyConstructor {
    public static void main (String args[]){
        Employee e1 = new Employee("Bhupendra", 500000);
        Employee e2 = new Employee(e1);

        System.out.println(e1.name + " " + e1.salary);
        System.out.println(e2.name + " " + e2.salary);
    }
}
