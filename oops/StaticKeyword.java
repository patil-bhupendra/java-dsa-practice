package oops;

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getname(){
        return this.name;
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "PBM";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}
