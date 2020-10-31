package nypOdev4;

import java.util.Scanner;

public class Test {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Cizgi cizgi[] = new Cizgi[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("baslangic x degeri girin");
            int x1 = scanner.nextInt();
            System.out.println("baslangic y degeri girin");
            int y1 = scanner.nextInt();
            Nokta n1 = new Nokta(x1, y1);
            System.out.println("bitis x degeri girin");
            int x2 = scanner.nextInt();
            System.out.println("bitis y degeri girin");
            int y2 = scanner.nextInt();
            Nokta n2 = new Nokta(x2, y2);
            cizgi[i] = new Cizgi(n1, n2);
            System.out.println(i + 1 + ". cizginin uzunlugu = " + cizgi[i].hesapla());
        }
    }
}
