// klavyeden girilin iki sayi carpimini yazdiran program.

package deneme.com;

import java.util.Scanner;

//@author Aysegul
public class DenemeClass {
    public static void main(String[] args) {
    System.out.println("bir sayi girin : ");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    System.out.println(x * y);   
}
}
