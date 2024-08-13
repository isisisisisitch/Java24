package ca.bytetube._06_nestedclass;

public class OuterClass {
    private int age = 1;

    public void func1() {
        System.out.println("this is an outerclass method");

    }

    public class InnerClass {
        private int age = 2;
//        static final int num = 10;

        public void func2() {
            System.out.println(age);
        }

    }
}
