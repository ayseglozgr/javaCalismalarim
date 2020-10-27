// String bir ifadenin palindrom olup olmadigini konrol eder. 

package palindromstring;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//@author Aysegul

public class PalindromString {

    public static void main(String[] args) throws Exception {

        
        String strn;
        int flag = 0;
        System.out.println("Enter the string:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strn = br.readLine();
        System.out.println("Result string is:");
        
        int a = strn.length();
        flag = 1;
        for (int i = 0; i < strn.length(); i++) {
            if (strn.charAt(i) !=strn.charAt(a-1)) { 
                flag = 0;       
                break;
            }else{
                a--; // 
            }
        }

        if (flag == 1) {
            System.out.print("palindrome");
        } else {
            System.out.print("not a palindrome2");
        }

    }

}
