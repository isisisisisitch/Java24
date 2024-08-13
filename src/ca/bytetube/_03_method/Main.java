package ca.bytetube._03_method;

public class Main {
    public static void main(String[] args) {

    }


    public static double sum(int a, double b, long c) {
        return a + b + c;
    }

    public static float sum(int a, double b, long c, short d) {
        return (float) (a + b + c);
    }

    public static double sum(char a, double b, long c, short d) {
        return a + b + c;
    }

    public static double sum(double b, int a, long c) {
        return a + b + c;
    }

}
