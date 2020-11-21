
package nypodev5_2;

public class Kare implements Dortgen {

    Point nokta[] = new Point[2];

    public Kare(Point nokta1, Point nokta3) {
        nokta[0] = nokta1;
        nokta[1] = nokta3;
    }

    public double alan() {
        return Math.abs((nokta[0].getX() - nokta[1].getX()) * (nokta[0].getY() - nokta[1].getY()));

    }

}
