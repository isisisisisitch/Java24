package ca.bytetube._13_multithread;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
