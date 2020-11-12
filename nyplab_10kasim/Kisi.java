// this static metodlarda kullanılamz.
package nyplab_10kasim;

class Kisi {
    String isim;
    String adres;
    String cinsiyet;

    public Kisi(String isim, String adres, String cinsiyet) {
        this.isim=isim;
        this.adres = adres;
        this.cinsiyet = cinsiyet;
    }
    public void isimAyarla(String bisim){
        this.isim = bisim.toUpperCase();
    }
    public void adresAyarla(String badres){
        this.adres = badres.toUpperCase();
    }
    public void cinsiyetAyarla (String bcinsiyet){
        this.isim = bcinsiyet.toUpperCase();
    }
    public String isimgetir(){
        return isim;
    }       
    public String adresgetir(){
        return adres;
    }
    public String cinsiyetgetir(){
        return cinsiyet;
    }

    @Override
    public String toString() {
        return "Kisi{" + "isim: " + isim + ", adres: " + adres + ", cinsiyet: " + cinsiyet + '}';
    }

}
