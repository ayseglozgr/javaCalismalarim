package nypodev3_ilksoru_ilkoncul;

import java.util.Scanner;

/*
 @author Aysegul
 */
public class NypOdev3_IlkSoru_IlkOncul {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[4];
        int orjinalSayi;
        System.out.println("sifrelenecek sayiyi girin : ");
        orjinalSayi = scanner.nextInt();
        if (orjinalSayi < 1000 || orjinalSayi <= 0 || orjinalSayi > 10000) { // 4 basamaklÄ± mi kontrolu.
            System.out.println("Gecersiz sayi girildi !");
        } else {
            for (int i = 0; i < 4; i++) {
                array[i] = ((orjinalSayi % 10) + 6) % 10;
                orjinalSayi /= 10;
            }
            System.out.println(array[1] + "" + array[0] + array[3] + array[2]);

        }

    }

}
