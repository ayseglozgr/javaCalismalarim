
package books;

import java.util.Scanner;


public class Challenge {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Books[] book = new Books[2];
        System.out.println("Title of fiction book:");
        String t = scanner.nextLine();
        book[0] = new Fiction(t);
        System.out.println("Title of non fiction book:");
        String t1 = scanner.nextLine();
        book[1] = new NonFiction(t1);
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i].print());
        }
    }
}
