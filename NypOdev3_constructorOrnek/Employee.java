package nypodev_ikincisoru;

public class Employee {

    private String ad;
    private String soyad;
    private double aylikMaas;

  

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public double getAylikMaas() {
        return aylikMaas;
    }

    public void setAylikMaas(double aylikMaas) {
        if (aylikMaas > 0) {
            this.aylikMaas = aylikMaas;
        }
    }

}
