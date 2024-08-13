package ca.bytetube._06_nestedclass;

public class Company {
    private String name;

    public Company(String name) {
        this.name = name;

    }


    public void fire(Employee employee) {
        System.out.println(name + " fire " + employee.no);
       // employee.show();
    }

    public class Employee {
        private int no;

        class A{
            int a = 1;
            public void func(){
                System.out.println(no);
            }

        }


        public Employee(int no) {

            this.no = no;
        }

        public void show() {
            for (int i = 0; i < 10; i++) {
                class A{

                }
            }
            System.out.println(name + " : " + no);
        }
    }
}
