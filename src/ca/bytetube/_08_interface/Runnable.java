package ca.bytetube._08_interface;

public interface Runnable {
    default void run(){
        System.out.println("Runnable-Run");
    }
}
