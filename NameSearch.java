
package namesearch;

import java.util.Scanner;
public class NameSearch {

    public static String names[] = {"harry", "michael", "will", "tom", "jackie"};
    public static String surnames[] = {"potter", "jackson", "smith", "cruise", "chan"};

    public static void main(String a[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.println("Enter the name:");
        name = sc.next();

        System.out.println("Full name of the celebraty is:");
        for (int i = 0; i < names.length; i++) {
            if(name.equals(names[i])){
                name = name + " " + surnames[i];
                break;
            }
        }
        System.out.println(name);
    }
}
