public class AbstractClassDemo {
    public static void main(String[] args) {
        Rectangle r= new Rectangle(4,2);
        r.info("Rectangle","Blue");
        r.getArea();
        r.getPerimeter();
        Triangle t = new Triangle();
        t.info("Triangle","Red");
        t.a= 5;
        t.b=3;
        t.c=4;
        t.getArea();
        t.getPerimeter();
        Circle c= new Circle();
        c.info("Circle","white");
        c.r=5;
        c.getArea();
        c.getPerimeter();
    }

}

abstract class Shape {
    public void info(String shapename, String color) {
        System.out.println("I am " + shapename + " with " + color + " color");
    }

    public abstract void getArea();

    public abstract void getPerimeter();

}

class Rectangle extends Shape {

    double l, b;

    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public void getArea() {
        System.out.println("The area is " + (l * b));

    }

    @Override
    public void getPerimeter() {
        System.out.println("The perimeter is " + (2 * (l + b)));

    }

}

class Triangle extends Shape {
    double a,b,c;
    @Override
    public void getArea() {
        double area;
        double s= (a+b+c)/2;
        area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the Triangle is "+ area);
    }

    @Override
    public void getPerimeter() {
        System.out.println("The perimeter of the Triangle is "+ (a+b+c));

    }

}

class Circle extends Shape {
    int r;
    @Override
    public void getArea() {
        System.out.println("The area of circle is " + (3.14*r*r));

    }

    @Override
    public void getPerimeter() {
        System.out.println("The perimeter of circle is " + (2*3.14*r));
    }

}
