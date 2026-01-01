package oops;

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    Student(String name){
        this(name, 0);
    }

    Student(){
        this("unknown", 0);
    }
}

public class ConstructorChaining {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Bhupendra", 0);
        Student s3 = new Student("Raghav", 23);

        System.out.println(s1.name + " " + s1.age);
        System.out.println(s2.name + " " + s2.age);
        System.out.println(s3.name + " " + s3.age);
    }
}