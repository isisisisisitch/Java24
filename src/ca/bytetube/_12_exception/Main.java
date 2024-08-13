package ca.bytetube._12_exception;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        PrintWriter writer = null;

        PrintWriter writer = new PrintWriter("/Users/dalluo/Desktop/finally.txt");


        writer.write("hello exception!");
        writer.flush();

    }

    @Test
    public void test9() {
        String name = null;
        int age = -36;
        try {
            Person person = new Person(name, age);
        } catch (EmptyNameException | WrongAgeException e) {
            e.printStackTrace();
        }


//        if (name == null || name.length() == 0) {
//            System.out.println("name must not be empty!");
//            return;
//        }
//        if (age < 0) {
//            System.out.println("wrong age:" + age + ", age must be > 0");
//            return;
//        }
//        Person person = new Person(name, age);
//        System.out.println(person);
    }

    @Test
    public void test8() {
        try {
            Person person = new Person();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(1);

    }

    @Test
    public void test7() {
        try {
            Class aClass = Class.forName("ca.bytetube._12_exception.Dog");
            Dog dog = (Dog) aClass.newInstance();
            System.out.println(dog);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test6() {
        Date date = new Date();
        System.out.println(date);//Mon Jul 08 21:46:12 EDT 2024
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);

    }

    @Test
    /**
     * 1_try-01
     * 1_try-02
     * 1_finally
     *
     * 2_try-01
     * 2_finally

     */
    public void test5() {
        for (int i = 1; i <= 3; i++) {
            try {
                System.out.println(i + "_try-01");
                if (i == 2) return;
                System.out.println(i + "_try-02");
            } finally {
                System.out.println(i + "_finally");
            }


        }
    }

    @Test
    public void test4() {

        PrintWriter writer = null;

        try {
            writer = new PrintWriter("/Users/dalluo/Desktop/finally.txt");
            Integer i1 = new Integer("abc");
        } catch (FileNotFoundException | NumberFormatException e) {
            e.printStackTrace();
        }

        System.out.println(2);
//
//        writer.write("hello exception!");
//        writer.flush();

    }

    @Test
    public void test3() {
        System.out.println(1);
        try {
            System.out.println(2);
            Integer i1 = new Integer("abc");
            System.out.println(3);
        } catch (NumberFormatException e) {
            Integer i1 = new Integer("123");
            System.out.println(4);
            System.out.println(i1);
        }
        System.out.println(5);

    }


    @Test
    public void test2() {
        Integer[] nums = {11, null, 22};
        for (Integer i : nums) {
            System.out.println(i);
        }
    }


    @Test
    public void test1() {
//        int[] arr = new int[1000000000];
        System.out.println(1);
        Integer i1 = new Integer("123");
        System.out.println(2);
        Integer i2 = new Integer("abc");
        System.out.println(3);
    }
}
