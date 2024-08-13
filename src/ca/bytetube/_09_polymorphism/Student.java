package ca.bytetube._09_polymorphism;

public class Student extends Person {
    public int age = 2;



    public int getSAge() {
        return age;
    }

    public void func(){
        System.out.println("Student - func");
    }
}
