
import java.util.Scanner;

interface Shape {

    public double area();

    public double peri();
}

class Challenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area, peri;
        System.out.print("Menu-\n1. Circle\n2. Rectangle\n3. Square\nEnter your choice :");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                Circle circ = new Circle(sc);

                area = circ.area();
                peri = circ.peri();
                System.out.print("Area of Circle is :" + area + "\nPerimeter of Circle is :" + peri);
                break;
            case 2:
                Rec rec = new Rec(sc);
                area = rec.area();
                peri = rec.peri();
                System.out.print("Area of Rectangle is :" + area + "\nPerimeter of Rectangle is :" + peri);
                break;
            case 3:
                Square sqr = new Square(sc);
                area = sqr.area();
                peri = sqr.peri();
                System.out.print("Area of Square is :" + area + "\nPerimeter of Square is :" + peri);
                break;
            default:
                System.out.print("Wrong choice");
        }
    }

    static class Circle implements Shape {

        public double x;
        public Scanner sc;

        public Circle(Scanner sc) {
            this.sc = sc;
        }

        public double radius() {
            System.out.println("enter the radius : ");
            x = sc.nextDouble();
            return x;
        }

        @Override
        public double area() {
            return Math.PI * radius() * x;

        }

        @Override
        public double peri() {
            return Math.PI * x * 2;
        }

    }

    static class Rec implements Shape {

        public double x;
        public double y;
        public Scanner sc;

        public Rec(Scanner sc) {
            this.sc = sc;
        }

        public double length() {
            System.out.println("enter the length : ");
            x = sc.nextDouble();
            return x;
        }

        public double width() {
            System.out.println("enter the width : ");
            y = sc.nextDouble();
            return y;
        }

        @Override
        public double area() {
            return width() * length();
        }

        @Override
        public double peri() {
            return 2 * (x + y);
        }

    }

    static class Square implements Shape {

        public double x;
        public Scanner sc;

        public Square(Scanner sc) {
            this.sc = sc;
        }

        public double side() {
            System.out.println("enter the side : ");
            x = sc.nextDouble();
            return x;
        }

        @Override
        public double area() {
            return side() * x;

        }

        @Override
        public double peri() {
            return x * 4;
        }
    }
}
