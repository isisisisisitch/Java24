package ca.bytetube._13_multithread;

public class Producer implements Runnable {
    private Drop drop;

    public Producer(Drop drop) {
        this.drop = drop;
    }

    @Override
    public void run() {
        String[] foods = {"beef", "bread", "apple", "cookie"};
        for (int i = 0; i < foods.length; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            drop.add(foods[i]);
        }
        //告诉消费者，不会再生产任何东西了
        drop.add(null);

    }


}
