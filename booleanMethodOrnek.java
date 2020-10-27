// girilen sayi 100 veya 200 e 10 kadar yakinsa true dondurur, degilse false.
// boolean method ornek
package codingbatornekk;

import java.util.Scanner;

//@author Aysegul
public class CodingBatOrnekk {

    public static boolean nearHundred(int n) {
        if ((n > 89 && n < 111) || (n < 211 && n > 189)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("bir sayi girin : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        System.out.println(nearHundred(a));
        

    }

}
