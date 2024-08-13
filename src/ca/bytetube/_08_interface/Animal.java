package ca.bytetube._08_interface;

public interface Animal {
//    public void run(){
//        System.out.println("Animal-Run");
//    }

    default String myself(){
        return "Im an animal!";
    }

}
