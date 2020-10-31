/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayiokunusu;

import java.util.Scanner;

/**
 *
 * @author Aysegul
 */
public class SayiOkunusu {

    
   	
	public static String ones[]={"one","two","three","four","five","six"," seven", "eight","nine","ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","ninteen"};      
        public static String tens[]={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};       
public static void main(String a[]) throws Exception
	{
        Scanner sc=new Scanner(System.in);
        int num,rem,t;   
 
      
         System.out.println("Enter the number:");
          num=sc.nextInt();
         System.out.println("Entered number is:");
       if(num<20){
           System.out.println(ones[num - 1]);
       }
       else if (num % 10 == 0){
           int k = num / 10;
           System.out.println(tens[k - 2]);
       }
       else{
           int k = num % 10;
           int r = num / 10;
           System.out.println(tens[r - 2] +" " + ones[k-1]);
           
       }
	  
        }//main 
}
