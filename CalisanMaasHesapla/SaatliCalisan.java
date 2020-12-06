// 1306170069 
// Ayse Ozgur
package nypodev6;

public class SaatliCalisan extends Calisan{
public int saatUcreti;
public int topCalSaati;
public SaatliCalisan(String ad,String soyad, String sskno, int saatUcreti, int topCalSaati){
   super(ad,soyad,sskno);
    this.saatUcreti=saatUcreti;
    this.topCalSaati=topCalSaati;
}
    @Override
    public double maasHesapla() {
        if(this.topCalSaati<=40 && this.topCalSaati>0){
            return this.saatUcreti * this.topCalSaati;
        }
        else {
            return this.saatUcreti * 40 + (this.topCalSaati - 40) * this.saatUcreti * 1.5; 
        }
    }
    
}
