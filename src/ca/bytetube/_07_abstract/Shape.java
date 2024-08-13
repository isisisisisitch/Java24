package ca.bytetube._07_abstract;

public abstract class Shape {
    protected double girth;
    protected double area;

    protected int count;
    protected int amount;

    public Shape() {
    }

    public Shape(int count, int amount) {
        this.count = count;
        this.amount = amount;
    }


    public double getGirth() {
        return girth;
    }

    public void setGirth(double girth) {
        this.girth = girth;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void show() {
        System.out.println("girth:" + getGirth());
        System.out.println("area:" + getArea());
    }

    public abstract void calculate();


}
