
package nypodev5_1;

public class Yamuk extends Dortgen {

    public Yamuk(Point nokta1, Point nokta2, Point nokta3, Point nokta4) {
        super(nokta1, nokta2, nokta3, nokta4);
    }

    public double alan() {
        double yukseklik = (getNokta1().getY() - getNokta3().getY());
        double altTaban = getNokta4().getX() - getNokta3().getX();
        double ustTaban = getNokta1().getX() - getNokta2().getX();
        return (Math.abs(ustTaban) + Math.abs(altTaban)) * Math.abs(yukseklik) / 2;
    }

}
