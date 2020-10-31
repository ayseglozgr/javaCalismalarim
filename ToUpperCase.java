package touppercase;

import java.util.scanner;


public class ToUpperCase {
 public static void main(String[] args) 
  {
   
    String str;
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string:"); 
    str = scanner.nextLine();

    str = str.toUpperCase();
    

    System.out.print("Uppercase conversion:");
      System.out.println(str);
    
  }
}
