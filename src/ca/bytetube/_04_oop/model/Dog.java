package ca.bytetube._04_oop.model;

public class Dog extends Animal{
    int age;
    public double weight;

    public Dog() {
        System.out.println("Dog constructor");
    }

    public Dog(int num) {
        System.out.println("Dog constructor");
    }




//    public Dog(int age) {
//        this.age = age;
//    }
//
//    public Dog(int age, double weight) {
//        this(age);
//        this.weight = weight;
//
////        this.age = age;
//    }


    //Integer ---> Number
    public Integer speak(){
        return null;
    }

    public void run() {
        System.out.println(this.age + "_" + this.weight + "_run");
    }

    public void eat(String food) {

        System.out.println(age + "_" + weight + "_eat_" + food);
    }
}
