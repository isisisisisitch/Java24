package ca.bytetube._13_multithread;

public class TaskA implements Runnable {
    @Override
    public void run() {
        System.out.println("this is task A");
    }
}
