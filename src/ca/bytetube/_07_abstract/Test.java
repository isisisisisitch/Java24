package ca.bytetube._07_abstract;

public class Test {
    public static void main(String[] args) {
        // Main main = new Main();
//        SubClass subClass = new SubClass();

//        Rectangle rectangle = new Rectangle(5, 10);
//        rectangle.calculate();
//        System.out.println("girth:" + rectangle.getGirth());
//        System.out.println("area:" + rectangle.getArea());


//        Circle circle = new Circle(5);
//        circle.calculate();
//        circle.show();

        Rectangle rectangle = new Rectangle(5,10);
//        rectangle.calculate();
//        rectangle.show();
        Circle circle = new Circle(5);

//        Triangle triangle = new Triangle(10,5);
//        triangle.calculate();
//        triangle.show();
//        Shape shape1 = new Rectangle(5,10);
//        shape1.calculate();
//        shape1.show();
//        Shape shape2 = new Circle(5);
//        shape2.calculate();
//        shape2.show();
       // Shape shape3 = new Triangle(5,10);
        calculates(circle);

    }

    public static void calculates(Shape shape){
        shape.calculate();
    }

}
