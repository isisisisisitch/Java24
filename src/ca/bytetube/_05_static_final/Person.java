package ca.bytetube._05_static_final;

public class Person {
    private int age = 1;
    static {

        System.out.println("Person static block");
    }

    {
        System.out.println("Person block");

    }

    public Person() {

        System.out.println("Person constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public final void superFunc(){}



    //    public int age;
//    public static int count ;
//
////    {
////        age = 1;
////    }
//    static {
//    count = 10;
//
//}
//
//
//    public Person() {
//
//        System.out.println(age);
//
//    }
//
//    public Person(int age) {
//
//        System.out.println(age);
//    }
//
//
//    public void func(Person this, int i) {
//        func1();
//        System.out.println(count);
//    }
//
//    public static void func1() {
//        func2();
////        func();
//    }
//
//    public static void func2() {
//        System.out.println(count);
//    }
}
