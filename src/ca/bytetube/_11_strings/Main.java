package ca.bytetube._11_strings;

import org.junit.Test;

public class Main {
    public static void main(String[] args) {
        test2();
//        test();
        // System.out.println(countSubString("1111111", "111"));
//        String s1 = "bytetube";
//        String s2 = "bytetube";
//        System.out.println(s1 == s2);//
//        String s = "555";
//        s += "555";
//        s = "666";
//        test(s);
//        System.out.println(s);
    }

    public static void test2() {
//        String s1 = "";
//        long time1 = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            s1 += i;
//        }
//        System.out.println(s1);
//        long time2 = System.currentTimeMillis();
//        System.out.println(time2 - time1);
        StringBuilder sb = new StringBuilder();

        long time3 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        System.out.println(sb.toString());
        long time4 = System.currentTimeMillis();
        System.out.println(time4 - time3);

    }


    public static int countSubString(String text, String pattern) {
        int count = 0;
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            if (text.length() - i < pattern.length()) break;
            int tmp = i;
            int j = 0;
            while (j < pattern.length()) {
                if (text.charAt(tmp++) != pattern.charAt(j++))
                    break;
            }
            if (j == pattern.length()) {
                count++;
            }
        }

        return count;
    }

    @Test
    public static void test() {
        Thread.interrupted();
        String s1 = "bytetube";
        String s2 = new String("bytetube");
        String s3 = s1;
        String s4 = new String(s2);

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s4 == s2);
        System.out.println(s3 == s4);
        System.out.println(s3 == s2);
    }
}
