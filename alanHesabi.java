//kullanıcıdan değer alarak ucgen, kare ve daire alanini verir.
// method overload kullandım.
package nppodev4_ikincisoru;

import java.util.Scanner;

public class NppOdev4_IkinciSoru {

    public static float alan(float taban, float yukseklik) {// ucgen alani
        return (taban * yukseklik / 2);
    }

    public static int alan(int kenar) { // kare alani
        return (kenar * kenar);
    }

    public static double alan(double yaricap) { // daire alani
        return (Math.PI * Math.pow(yaricap, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("alanını bulmak istediğiniz şekil (numara olarak belirtin.) : ");
        System.out.println("1-ucgen");
        System.out.println("2-kare");
        System.out.println("3-daire");
        int a;
        a = scanner.nextInt();
        if (a == 1) {
            System.out.println("taban  : ");
            float taban = scanner.nextFloat();
            System.out.println("yukseklik: ");
            float yukseklik = scanner.nextFloat();
            System.out.print("ucgenin alani = ");
            System.out.println(alan(taban, yukseklik));
        } else if (a == 2) {
            System.out.println("bir kenari: ");
            int kenar = scanner.nextInt();
            System.out.print("karenin alani = ");
            System.out.println(alan(kenar));
        }
        else if(a == 3){
            double pi = 3.14;
            System.out.println("yaricap: ");
            double yaricap = scanner.nextDouble();
            System.out.print("dairenin alani: ");
            System.out.println(alan(yaricap));
        }
        else
        {
            System.out.println("gecersiz secim !");
        }
    }
}
