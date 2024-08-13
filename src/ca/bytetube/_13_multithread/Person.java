package ca.bytetube._13_multithread;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public synchronized void hello(Person p) {
            System.out.format("[%s] hello to [%s]%n", name, p.name);
            p.smile(this);//jack


    }

    public synchronized void smile(Person p) {

            System.out.format("[%s] smile to [%s]%n", name, p.name);


    }

    public static void main(String[] args) {
        Person jack = new Person("jack");
        Person rose = new Person("rose");
        new Thread(() -> { jack.hello(rose); }).start();//A
        new Thread(() -> { rose.hello(jack); }).start();//B
    }
}
