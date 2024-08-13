package ca.bytetube._10_number;

import org.junit.Test;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Integer i1 = 88;
        Integer i2 = Integer.valueOf(88);
        Integer i3 = new Integer(88);
        System.out.println(i1 == i2);
        System.out.println(i1 == i3);

        //Integer cache [-128,127]
//        Integer i1 = 88;
//        Integer i2 = 88;
//        Integer i3 = 128;
//        Integer i4 = 128;
//        System.out.println(i1 == i2);
//        System.out.println(i1.equals(i2));
//        System.out.println(i3 == i4);
//        System.out.println(i3.equals(i4));

//        Integer i1 = Integer.valueOf(10);
//        Double i2 = 100.0;
//        double i3 = i2.doubleValue();

//        int[] data2 = {100,-50,65,-170,0};
//        int i = 10;
//        IntObj obj = new IntObj(100);
//
//        IntObj[] data = {new IntObj(100),new IntObj(-50),
//                new IntObj(65),new IntObj(-170),new IntObj(0),null};
    }
    @Test
    public void test(){
        BigDecimal v1 = new BigDecimal("0.7");
        BigDecimal v2 = new BigDecimal("0.7");
        System.out.println(v1.add(v2));
        System.out.println(v1.subtract(v2));
        System.out.println(v1.multiply(v2));
        System.out.println(v1.divide(v2));
    }

}
