
package digitsum;

import java.util.Scanner;


public class DigitSum { 

public static void main(String arg[])throws Exception{

Scanner scanner = new Scanner(System.in);
System.out.println("Enter the date(ddmmyy):");
int number =scanner.nextInt();
int toplam=0;
for(int i =0; i < 8; i++){
    toplam += number % 10;
    number = number / 10;
}
if(toplam > 9){
    number = toplam / 10 + toplam % 10;
    if(number>9){
        number = number / 10 + number % 10;
    }
}
else{
    number = toplam;
}


System.out.println("Your lucky number is:"); 
System.out.println(number);
   
}//main

    
}
