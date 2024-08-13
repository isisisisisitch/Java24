package ca.bytetube._05_static_final;


public class Rocket {
//    eager
//    private static Rocket rocket = new Rocket();
//
//    private Rocket() {
//    }
//
//    public static Rocket getInstance() {
//        return rocket;
//    }

    //lasyer
    private static Rocket rocket = null;

    private Rocket() {
    }

    public static Rocket getInstance() {

        if (rocket == null) {
            //T1
            rocket = new Rocket();

        }
        return rocket; //T2
    }

}
