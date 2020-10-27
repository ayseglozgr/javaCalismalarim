// şifrelenmiş sayıyı orjinal sayıya çeviren program.
// 
package nypodev3_ilksoru_ikincioncul;

import java.util.Scanner;

/*
 * @author Aysegul
 */
public class NypOdev3_IlkSoru_IkinciOncul {

    public static void main(String[] args) {
        System.out.println("sifrelenmis sayiyi giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int sifrelenmisSayi = scanner.nextInt();
        if (sifrelenmisSayi < 10000 && sifrelenmisSayi > 999) {
            int array[] = new int[4];
            for (int i = 0; i < 4; i++) {
                array[i] = ((sifrelenmisSayi % 10) + 4) % 10;
                sifrelenmisSayi /= 10;
            }
            System.out.println(array[1] + "" + array[0] + array[3] + array[2]);
        }else{
            System.out.println("lütfen 4 basamaklı bir sayi girin !");
        }

    }

}
