package ca.bytetube._06_nestedclass;

public class Person {
    private static int age;

    public static void func1(){

    }
   public static class Car{
       private static int num;

       public void func(){
           System.out.println(age);
           func1();
       }
   }
}


