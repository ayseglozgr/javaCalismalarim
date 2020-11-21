package arraysiralama;

import java.util.Scanner;

public class ArraySiralama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[10];
        
 // sayıları burada aldık.
        System.out.println("enter ten numbers for array : ");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
// burdan sonra sıralamaya basladı.
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int a;
                if (arr[i] < arr[j]) {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
