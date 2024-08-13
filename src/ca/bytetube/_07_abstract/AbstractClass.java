package ca.bytetube._07_abstract;

public abstract class AbstractClass {
    private int num;
    public static final int COUNT = 10;

    public static class InnerClass {

    }

    public abstract void func();

    public AbstractClass() {
    }

    public AbstractClass(int num) {
        this.num = num;
    }

    public void func2() {

    }

    public static void staticMethod(){}
}
