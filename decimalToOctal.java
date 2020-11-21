package decimaltooctal;

import java.util.ArrayList;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("10luk sistemde bir sayi girin : ");
        int a = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(); //template class 
        int i = 0;

        while (true) {
            arr.add(a % 8);
            a = a / 8;
            i++;
            if (a == 0) {
                break;
            }
        }
        
        int j;
        
        for (j = arr.size()-1; j >= 0; j--) {
            System.out.print(arr.get(j));
        }

    }

}
