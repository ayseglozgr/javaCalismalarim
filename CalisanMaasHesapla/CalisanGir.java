// 1306170069 
// Ayse Ozgur
package nypodev6;

import java.util.Scanner;

public class CalisanGir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calisan[] arr = new Calisan[3];
        Calisan calisan;
        for (int i = 0; i < 3; i++) {

            System.out.println("Çalışan maaşlı(1) mı, saatli(2) mi yoksa primli(3) çalışan mı? verilen numaralara göre giriniz.");
            int calisanTuru = scanner.nextInt();
            scanner.nextLine();
            System.out.println("calisan adini girin");
            String adi = scanner.nextLine();
            System.out.println("calisan soyadini girin");
            String soyadi = scanner.nextLine();
            System.out.println("calisan sskno girin");
            String sskno = scanner.nextLine();
            if (calisanTuru == 1) { // maasli 
                System.out.println("haftalık maaşı girin");
                int haftalikMaas = scanner.nextInt();
                calisan = new MaasliCalisan(adi, soyadi, sskno, haftalikMaas);
                arr[i] = calisan;
            } else if (calisanTuru == 2) { // saatli
                System.out.println("saat ücretini girin");
                int saatUcreti = scanner.nextInt();
                System.out.println("toplam çalışma saatini girin");
                int topCalSaati = scanner.nextInt();
                calisan = new SaatliCalisan(adi, soyadi, sskno, saatUcreti, topCalSaati);
                arr[i] = calisan;
            } else if (calisanTuru == 3) { // primli
                System.out.println("satış başına aldığı prim ücretini girin");
                int satisBasinaPrim = scanner.nextInt();
                System.out.println("Kac adet satış yapıldığını girin");
                int kacTaneSatis = scanner.nextInt();
                calisan = new PrimliCalisan(adi, soyadi, sskno, satisBasinaPrim, kacTaneSatis);
                arr[i] = calisan;
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + ". kişi \n" + "adı soyadı :  " + arr[i].ad + " " + arr[i].soyad + "\nsskno : " + arr[i].sskno + "\nmaaş : " + arr[i].maasHesapla() + "\n");
        }
    }
}
