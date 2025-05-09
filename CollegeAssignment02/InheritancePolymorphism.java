// Superclass
class Shape {
    public void area() {
        System.out.println("Calculating area of a shape...");
    }
}

// Subclass: Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Subclass: Rectangle
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Main class to test polymorphism
public class InheritancePolymorphism {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);         // Polymorphic reference
        Shape s2 = new Rectangle(4, 6);   // Polymorphic reference

        s1.area();  // Calls Circle's area()
        s2.area();  // Calls Rectangle's area()
    }
}
