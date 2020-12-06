// 1306170069 
// Ayse Ozgur
package nypodev6;

public class MaasliCalisan extends Calisan {

    public double haftalikMaas;

    public MaasliCalisan(String ad,String soyad, String sskno, double haftalikMaas) {
        super(ad,soyad,sskno);
        this.haftalikMaas = haftalikMaas;
    }

   
    public double maasHesapla() {
        return this.haftalikMaas * 4;
    }

}
