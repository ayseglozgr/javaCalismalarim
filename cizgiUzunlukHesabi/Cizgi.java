package nypOdev4;

public class Cizgi {

    private Nokta n1;
    private Nokta n2;

    public Cizgi(Nokta n1, Nokta n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
 public double hesapla() {
        double a = Math.sqrt(Math.pow((n1.x - n2.x), 2) + Math.pow((n1.y - n2.y), 2));
        return a;
    }
}
