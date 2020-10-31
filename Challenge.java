
package circleclass;
import java.util.Scanner;


public class Challenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter radius:");
        double rad = scanner.nextDouble();
        System.out.println("Enter color:");
        String col = scanner.next();

        MyCircle mc = new MyCircle(rad, col);

        System.out.println(mc.getArea());
        System.out.println(mc.color);
    }
}
class MyCircle {

    public double rad;
    public String color;

    public MyCircle(double rad, String color) {
        this.rad = rad;
        this.color = color;
    }

    public double getArea() {

        return Math.PI * rad * rad;
    }
}

