
// bir sayinin binary mi değil mi oldugunu kontrol eden program.
// binary ise sayiyi yazdirip "Binary" ciktisini verir. 
//değilse sayiyi yazdirip "Not Binary" ciktisini verir.
package binarymi;

import java.util.Scanner;

//@author Aysegul
public class BinaryMi {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        String b = String.valueOf(num);
        int k = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '0' || b.charAt(i) == '1') {

            } else {
                k = 1;
                break;
            }
        }
        if (k == 1) {
            System.out.println("Not Binary");

        } else {

            System.out.println("Binary");
        }

        System.out.println("The number is: " + b);

    }

}
