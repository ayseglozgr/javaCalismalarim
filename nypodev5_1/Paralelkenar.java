
package nypodev5_1;

public class Paralelkenar extends Dortgen {

    public Paralelkenar(Point nokta1, Point nokta2, Point nokta3) {
        super(nokta1, nokta2, nokta3);
    }

    public double alan() {
        double yukseklik = (getNokta1().getY() - getNokta3().getY());
        double taban = getNokta1().getX() - getNokta2().getX();
        return Math.abs(yukseklik * taban);
    }

}
