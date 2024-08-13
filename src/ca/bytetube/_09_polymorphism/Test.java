package ca.bytetube._09_polymorphism;

public class Test {
    public static void main(String[] args) {

//        speak(new Animal());
//        speak(new Dog());
//        speak(new Cat());
//        Student student1 = new Student();
//        System.out.println(student1.age);//2
//        System.out.println(student1.getPAge());//1
//        System.out.println(student1.getSAge());//2

//        Person student2 = new Student();
//        System.out.println(student2.age);//1
//        System.out.println(student2.getPAge());//1
//        student2.func();

//        Teacher tea1 = new Teacher();
//        System.out.println(tea1.age);
//        System.out.println(tea1.getPAge());
//        System.out.println(tea1.getTAge());
//        Person tea2 = new Teacher();
//        System.out.println(tea2.age);
//        System.out.println(tea2.getPAge());
        speak(new Cat());
    }

    static void speak(Animal animal) {
        if (animal instanceof Dog) {
            ((Dog) animal).wang();
        }

    }
}
