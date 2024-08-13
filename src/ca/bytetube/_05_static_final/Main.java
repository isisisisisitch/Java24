package ca.bytetube._05_static_final;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getAge());

        student.setAge(10);
        System.out.println(student.getAge());
        student.superFunc();

//        Rocket rocket1 = Rocket.getInstance();
//        Rocket rocket2 = Rocket.getInstance();
//        System.out.println(rocket1 == rocket2);
//        Student student1 = new Student();
//        Student student2 = new Student();
//        Person person1 = new Person();
//        Person.func1();
//        System.out.println(Person.count);
//        Person person2 = new Person(100);
//        System.out.println(person2.age);

//        System.out.println(Person.count);
//        Person.func1();


    }
}
