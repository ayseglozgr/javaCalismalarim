// girilen bir aci degerinin hangi ceyrekte oldugunu verir.
package QuadrantOfAnAngle_;

import java.util.Scanner;


public class QuadrantOfAnAngle {
  
   
   public static void main (String[] args)
   {
      
      int angle = 0;
      System.out.println("Type an integer angle (in degrees) and press Enter:");
      Scanner sc = new Scanner(System.in);
      angle= sc.nextInt();
      int a = angle % 360;

      int quadrant = 0;
      if (a <= 90 && 0<=a){
          quadrant = 1;
      }
      else if(a > 90 && a <=180){
          quadrant = 2;
      }
      else if (a > 180 && a <=270){
          quadrant =3;
      }
      else if(a > 270&& a<360){
          quadrant =4;
      }
      
      System.out.println("Quadrant is:" + quadrant);
     
   }
} 



    

