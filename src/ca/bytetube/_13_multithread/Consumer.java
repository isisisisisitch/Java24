package ca.bytetube._13_multithread;

public class Consumer implements Runnable {
    private Drop drop;

    public Consumer(Drop drop) {
        this.drop = drop;
    }

    @Override
    public void run() {
        String food = null;
        while ((food = drop.get()) != null){
            System.out.format("consumer consumes the food produced by producer: %s%n",food);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
