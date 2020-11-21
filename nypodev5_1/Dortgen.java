
package nypodev5_1;

public class Dortgen {

    private Point nokta[] = new Point[4];

    public Dortgen(Point nokta1, Point nokta2, Point nokta3, Point nokta4) {
        nokta[0] = nokta1;
        nokta[1] = nokta2;
        nokta[2] = nokta3;
        nokta[3] = nokta4;
    }

    public Dortgen(Point nokta1, Point nokta2, Point nokta3) {
        nokta[0] = nokta1;
        nokta[1] = nokta2;
        nokta[2] = nokta3;
    }

    public Dortgen(Point nokta1, Point nokta3) {
        nokta[0] = nokta1;
        nokta[2] = nokta3;
    }

    public Point getNokta1() {
        return nokta[0];
    }

    public void setNokta1(Point nokta1) {
        this.nokta[0] = nokta1;
    }

    public Point getNokta2() {
        return nokta[1];
    }

    public void setNokta2(Point nokta2) {
        this.nokta[1] = nokta2;
    }

    public Point getNokta3() {
        return nokta[2];
    }

    public void setNokta3(Point nokta3) {
        this.nokta[2] = nokta3;
    }

    public Point getNokta4() {
        return nokta[3];
    }

    public void setNokta4(Point nokta4) {
        this.nokta[3] = nokta4;
    }

    public double alan() {

        return Math.abs((nokta[0].getX() - nokta[2].getX()) * (nokta[0].getY() - nokta[2].getY()));
    }
}
