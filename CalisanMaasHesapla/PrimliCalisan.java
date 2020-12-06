// 1306170069 
// Ayse Ozgur
package nypodev6;

public class PrimliCalisan extends Calisan{
public int satisBasinaPrim;
public int kacTaneSatis;
public PrimliCalisan(String ad,String soyad, String sskno, int satisBasinaPrim, int kacTaneSatis ){
    super(ad,soyad,sskno);
    this.satisBasinaPrim=satisBasinaPrim;
    this.kacTaneSatis=kacTaneSatis;
}
    @Override
    public double maasHesapla() {
        return this.kacTaneSatis * this.satisBasinaPrim;
    }
    
}
