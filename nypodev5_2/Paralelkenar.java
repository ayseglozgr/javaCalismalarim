/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nypodev5_2;

public class Paralelkenar implements Dortgen {

    Point nokta[] = new Point[3];

    public Paralelkenar(Point nokta1, Point nokta2, Point nokta3) {
        nokta[0] = nokta1;
        nokta[1] = nokta2;
        nokta[2] = nokta3;
    }

    public double alan() {
        double yukseklik = (nokta[0].getY() - nokta[2].getY());
        double taban = nokta[0].getX() - nokta[1].getX();
        return Math.abs(yukseklik * taban);
    }

}
