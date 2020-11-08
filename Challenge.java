package quadrantpoint;

import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x coordinate:");
        int num1 = scanner.nextInt();
        System.out.println("Enter y coordinate:");
        int num2 = scanner.nextInt();
        Point point = new Point(num1, num2);
        System.out.println("Quadrant " + point.quadrant());
    }

}

class Point {

    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int quadrant() {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }
}
