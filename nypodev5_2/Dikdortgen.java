/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nypodev5_2;

public class Dikdortgen implements Dortgen {

    Point nokta[] = new Point[2];

    public Dikdortgen(Point nokta1, Point nokta3) {
        nokta[0] = nokta1;
        nokta[1] = nokta3;
    }

    @Override
    public double alan() {
        return Math.abs((nokta[0].getX() - nokta[1].getX()) * (nokta[0].getY() - nokta[1].getY()));

    }
}


