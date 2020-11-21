package nypodev5_1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("“yamuk”, “paralelkenar”, “dikdörtgen” ve “kare” şekillerinden hangisinin alanını hesaplamak istiyorsunuz ");
        String mesaj = scanner.nextLine();

        switch (mesaj) {
            case "yamuk": {
                System.out.println("(alt ve üst taban x eksenine paralel olmalı)");
                Point point[] = new Point[4];
                for (int i = 0; i < 4; i++) {
                    System.out.println(i + 1 + ". x ve y degerlerini girin");
                    point[i] = new Point(scanner.nextInt(), scanner.nextInt());
                }
                Yamuk yamuk = new Yamuk(point[0], point[1], point[2], point[3]);
                System.out.println("yamuğun alanı: " + yamuk.alan());
                break;
            }

            case "paralelkenar": {
                System.out.println("(alt ve üst taban x eksenine paralel olmalı)");
                Point point[] = new Point[4];
                for (int i = 0; i < 4; i++) {
                    System.out.println(i + 1 + ". x ve y degerlerini girin");
                    point[i] = new Point(scanner.nextInt(), scanner.nextInt());
                }
                Paralelkenar paralelkenar = new Paralelkenar(point[0], point[1], point[2]);
                System.out.println("paralelkenarın alanı: " + paralelkenar.alan());
            }
            break;
            case "dikdortgen": {
                System.out.println("(alt ve üst taban x eksenine paralel olmalı)");
                Point point[] = new Point[4];
                for (int i = 0; i < 4; i++) {
                    System.out.println(i + 1 + ". x ve y degerlerini girin");
                    point[i] = new Point(scanner.nextInt(), scanner.nextInt());
                }
                Dikdortgen dikdortgen = new Dikdortgen(point[0], point[2]);
                System.out.println("dikdortgen alanı: " + dikdortgen.alan());
            }
            break;
            case "kare": {
                System.out.println("(alt ve üst taban x eksenine paralel olmalı)");
                Point point[] = new Point[4];
                for (int i = 0; i < 4; i++) {
                    System.out.println(i + 1 + ". x ve y degerlerini girin");
                    point[i] = new Point(scanner.nextInt(), scanner.nextInt());
                }
                Kare kare = new Kare(point[0], point[2]);
                System.out.println("kare alanı: " + kare.alan());
            }
            break;
            default:
                System.out.println("yanlış secim !");
                break;
        }

    }

}
