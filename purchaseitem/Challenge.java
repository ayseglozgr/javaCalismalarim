package purchaseitem;

import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name1 = scanner.nextLine();
        System.out.println("Enter unit price:");
        double up = scanner.nextDouble();
        System.out.println("Enter weight:");
        double w = scanner.nextDouble();
        WeighedItem item1 = new WeighedItem(name1, up, w);

        scanner.nextLine();
        System.out.println("Enter name:");
        String name2 = scanner.nextLine();
        System.out.println("Enter unit price:");
        double up1 = scanner.nextDouble();
        System.out.println("Enter quantity:");
        int q = scanner.nextInt();
        CountedItem item2 = new CountedItem(name2, up1, q);
        System.out.println(item1);
        System.out.println(item2);
    }
}





