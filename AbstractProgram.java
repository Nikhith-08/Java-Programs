abstract class Shape {
    int a = 10, b = 20;

    abstract void printArea();
}

class Rectangle extends Shape {
    void printArea() {
        System.out.println("Area of rectangle is: " + a * b);
    }
}

class Triangle extends Shape {
    void printArea() {
        System.out.println("Area of triangle is: " + a * b / 2);
    }

}

class Circle extends Shape {
    void printArea() {
        System.out.println("Area of circle is: " + (3.14 * a * a));
    }

}

class AbstractProgram {
    public static void main(String[] args) {
        Shape s;
        s = new Rectangle();
        s.printArea();
        s = new Triangle();
        s.printArea();
        s = new Circle();
        s.printArea();
    }
}
