import java.util.*;

// Do not edit the Quadrilateral class
abstract class Quadrilateral {
   double side1; //6
   double side2;// 6
   double side3;// 6
   double side4;// 6

   public Quadrilateral(double side1, double side2, double side3, double side4) {
       this.side1 = side1;
       this.side2 = side2;
       this.side3 = side3;
       this.side4 = side4;
   }

   protected abstract double getArea();

   protected double getPerimeter() {
       return (side1+side2+side3+side4);
   }
}

// Implement class Parallelogram and methods getArea() and getPerimeter()
class Parallelogram extends Quadrilateral {
    //Write your code here
    double height;
    public Parallelogram(double side1, double side2, double height) {
        super(side1, side2, side1, side2);// super(7,7,7,7)
        this.height = height;
    }

    public double getArea() {
        return side1 * height;
    }
   
}

// Implement class Rhombus and methods getArea() and getPerimeter()
class Rhombus extends Parallelogram {
    //Write your code here
    public Rhombus(double side1, double height) {
        super(side1, side1, height);
    }
}

//Implement class Rectangle and methods getArea() and getPerimeter()
class Rectangle extends Parallelogram {
    //Write your code here
    public Rectangle(double length, double breadth) {
        super(length, breadth, breadth);
    }
  
}
//Implement class Square and methods getArea() and getPerimeter()
class Square extends Rhombus {
    //Write your code here
   public Square(double side) { // 6
       super(side, side);
   }
}

// Do not edit the Main class
class Main {
   public static void main(String[] args) {
       //Write your code here
       Scanner scan = new Scanner(System.in);
       // Parallelogram
       double side1 = scan.nextDouble();
       double side2 = scan.nextDouble();
       double height = scan.nextDouble();
        Parallelogram parallelogram = new Parallelogram(side1, side2, height);

        // Rhombus
        double base = scan.nextDouble();
        double heightR = scan.nextDouble();
        Rhombus rhombus = new Rhombus(base, heightR);

        // Rectangle
        double length = scan.nextDouble();
        double breadth = scan.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);

        // Square
        double side = scan.nextDouble();
        Square square = new Square(side);

        if (side1 < 0 || side2 < 0 || height < 0 || base < 0 || heightR < 0 ||
        length < 0 || breadth < 0 || side < 0) {
           System.out.println("Length of a side cannot be negative. Please Enter a positive integer");
           return;
        }

        System.out.println("Perimeter of Parallelogram is " + parallelogram.getPerimeter() +" and Area of Parallelogram is " + parallelogram.getArea());
        System.out.println("Perimeter of Rhombus is " + rhombus.getPerimeter() +" and Area of Rhombus is " + rhombus.getArea());
        System.out.println("Perimeter of Rectangle is " + rectangle.getPerimeter() +" and Area of Rectangle is " + rectangle.getArea());
        System.out.println("Perimeter of Square is " + square.getPerimeter()+ " and Area of Square is " + square.getArea());

       scan.close();
   }
}
