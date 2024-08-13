package ca.bytetube._05_static_final;

public class Student extends Person {
    public static final Person COUNT = new Person();

    static {

        System.out.println("Student static block");
    }

    {

        System.out.println("Student block");

    }

    public Student() {

        System.out.println("Student constructor");
    }

    //    @Override
    public void func1() {
        System.out.println(COUNT);
    }

    public void func2() {
        System.out.println(COUNT);
    }
}
