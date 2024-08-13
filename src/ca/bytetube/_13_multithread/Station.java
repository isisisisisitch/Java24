package ca.bytetube._13_multithread;

public class Station implements Runnable {

    private int tickets = 100;

    public synchronized boolean saleTicket() throws InterruptedException {


        if (tickets < 1) return false;
        tickets--;
        Thread.sleep(100);
        String name = Thread.currentThread().getName();
        System.out.println(name + " sell a ticket and remain " + tickets);

        return tickets > 0;


    }

    @Override
    public void run() {
        while (true) {
            try {
                if (!saleTicket()) break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ;
        }

    }
}
