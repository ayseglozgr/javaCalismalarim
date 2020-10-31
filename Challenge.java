package ornek;

import java.util.Scanner;
import java.util.Scanner;

class Challenge {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Author aut;

        System.out.println("Enter name:");
        String somename = scanner.nextLine();

        System.out.println("Enter email:");
        String semail = scanner.nextLine();

        System.out.println("Enter book name:");
        String sbook = scanner.nextLine();

        aut = new Author(somename, semail, sbook);

        System.out.println(aut.somename + "\n" + aut.semail + "\n" + aut.sbook);
    }
}

class Author {

    public String somename;
    public String semail;
    public String sbook;

    public Author(String name, String semail, String sbook) {
        this.somename = name;
        this.semail = semail;
        this.sbook = sbook;
    }
}
