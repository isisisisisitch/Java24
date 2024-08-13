package ca.bytetube._08_interface;

public interface Fly extends Animal {
    default String myself(){
        return "Im able to fly!";
    }
}
