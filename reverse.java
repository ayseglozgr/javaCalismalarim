import java.io.*;
import java.util.Scanner;

public class statement_reverse {

    public static void main(String a[]) throws Exception {
        String strarr[];    //array which will hold splitted strings of the statement
        String st;      //contains user input statement 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Statement:");
        st = br.readLine();
        System.out.println("The reverse is:");
        st += " ";
        strarr = st.split(" ");
        int k = strarr.length;
        for (int i = k - 1; i >= 0; i--) {
            System.out.print(strarr[i] + " ");
        }
    }
}
