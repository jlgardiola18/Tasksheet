package Tasksheet128;

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

abstract class AbstractShape implements Shape {

    String color;
    double length;
    double width;

    AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

}

class Circle extends AbstractShape {
    private double radius;

    public Circle(String color, double radius) {
        super(color, 0, 0); 
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return "Circle [color=" + color + ", radius=" + radius + "]";
    }

}

class Rectangle extends AbstractShape {

    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String toString() {
        return "Rectangle [color=" + color + ", length=" + length + ", width=" + width + "]";
    }

}

public class Tasksheet128 {
    public static void main(String[] args) {
        
        Circle circle = new Circle("Black", 3.0);
        System.out.println("Circle Details:");
        System.out.println("Color: " + circle.color);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle("Gray", 10.0, 6.0);
        System.out.println("\nRectangle Details:");
        System.out.println("Color: " + rectangle.color);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

    }
    
}
