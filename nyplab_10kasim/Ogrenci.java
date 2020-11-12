
package nyplab_10kasim;

   class Ogrenci extends Kisi{
    private String bolum;
    private int donem;

    public Ogrenci( String isim, String adres, String cinsiyet,String bolum, int donem) {
        super(isim, adres, cinsiyet);
        this.bolum = bolum.toUpperCase();
        this.donem = donem;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum.toUpperCase();
    }

    public int getDonem() {
        return donem;
    }

    public void setDonem(int donem) {
        this.donem = donem;
    }

    @Override
    public String toString() {
        return "Kisi Bilgileri => " + "isim=" + isimgetir() + ", adres=" + adresgetir() + ", cinsiyet=" + cinsiyetgetir() + ", bolum=" + bolum + ", donem=" + donem;
    }
    
}

