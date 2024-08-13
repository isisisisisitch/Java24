package ca.bytetube._13_multithread;

import org.junit.Test;


public class Main {
    public static void main(String[] args) {
        Drop drop = new Drop();

        new Thread(new Producer(drop)).start();
        new Thread(new Consumer(drop)).start();


//        new Thread(() -> {
//            synchronized ("1") {
//                System.out.println("1-1");
//
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                synchronized ("2") {
//                    System.out.println("1-2");
//                }
//
//            }
//
//        }).start();
//
//        new Thread(() -> {
//            synchronized ("2") {
//                System.out.println("2-1");
//
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                synchronized ("1") {
//                    System.out.println("2-2");
//                }
//
//            }
//
//        }).start();
//        Station station = new Station();
//        for (int i = 0; i <= 4; i++) {
//            Thread thread = new Thread(station);
//            thread.setName("window " + i);
//            thread.start();
//        }
//        Thread t1 = new Thread(() -> {
//            System.out.println("t1-begin");
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("t1-end");
//        });
//
//        t1.start();
//        Thread t2 = new Thread(() -> {
//            System.out.println("t2-begin");
//            System.out.println("t1.isAlive-" + t1.isAlive());
//            try {
//                t1.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("t1.state-" + t1.getState());
//            System.out.println("t1.isAlive-" + t1.isAlive());
//            System.out.println("t2-end");
//        });
//
//        t2.start();
    }

    @Test
    public void test6() {
        new Thread(() -> {
            synchronized ("1") {
                System.out.println("1-1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized ("2") {
                    System.out.println("1-2");
                }

            }

        }).start();

        new Thread(() -> {
            synchronized ("2") {
                System.out.println("2-1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized ("1") {
                    System.out.println("2-2");
                }

            }

        }).start();

    }


    @Test
    public void test5() throws InterruptedException {
        Station station = new Station();
        for (int i = 0; i <= 4; i++) {
            Thread thread = new Thread(station);
            thread.setName("window " + i);
            thread.start();
        }
    }

    @Test
    public void test4() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("t1-begin");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t1-end");
        });

        t1.start();
        Thread t2 = new Thread(() -> {
            System.out.println("t2-begin");
            System.out.println("t1.isAlive-" + t1.isAlive());
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t1.state-" + t1.getState());
            System.out.println("t1.isAlive-" + t1.isAlive());
            System.out.println("t2-end");
        });

        t2.start();
    }


    @Test
    public void test3() throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("begin");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
            System.out.println("end");
        });

        thread.start();
        Thread.sleep(1000);
        thread.interrupt();


    }


    @Test
    public void test2() {
        MyThread thread1 = new MyThread();
        thread1.start();
        MyThread thread2 = new MyThread();
        thread2.start();
    }

    @Test
    public void test1() {
        Thread t1 = new Thread(new TaskA());

        t1.start();

        Thread t2 = new Thread(() -> System.out.println("current thread :" + Thread.currentThread()));

        t2.start();

    }
}
