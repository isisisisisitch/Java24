package ca.bytetube._13_multithread;

public class TaskB implements Runnable {
    @Override
    public void run() {
        System.out.println("this is task B");
    }
}
