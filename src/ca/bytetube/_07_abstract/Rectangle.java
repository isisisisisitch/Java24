package ca.bytetube._07_abstract;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public void calculate() {
        girth = (width + height) * 2;
        area = width * height;
    }


}
