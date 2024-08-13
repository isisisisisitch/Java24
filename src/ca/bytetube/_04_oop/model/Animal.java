package ca.bytetube._04_oop.model;

public class Animal  extends Object{

    public Animal() {
    }

    public Animal(int age) {

        System.out.println("Animal constructor");
    }

    protected Number speak(){
        return null;
    }
}
