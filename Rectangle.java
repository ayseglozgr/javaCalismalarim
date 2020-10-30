
// verilen degerlere göre ici boş dörtgen yazdırır.
package PrintRectangle;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dortgenin yuksekligi");
        int yukseklik = scanner.nextInt();
        System.out.println("dörtgenin genisligi: ");
        int genislik = scanner.nextInt();

        for (int i = 0; i < genislik; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < yukseklik - 2; i++) {

            for (int j = 0; j < genislik; j++) {
                if ((j == 0) || ((j == genislik - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < genislik; i++) {
            if ((i != 0) || (i != (genislik - 1))) {
                System.out.print("*");
            }
        }
        System.out.println("");
    }

}
