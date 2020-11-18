import java.util.Scanner;

class Challenge {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();
        String reverse = "";
        for (int i = line.length () - 1; i >=0 ; i--) {
            reverse += line.charAt(i);
        }
        if (line.equals(reverse)) {
            System.out.println("Entered string is a palindrome.");
        }
        else
        {
            System.out.println("Entered string is not a palindrome.");
        }
    }

}
