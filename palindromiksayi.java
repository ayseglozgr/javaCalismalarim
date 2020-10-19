/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyplab3;
/**
 *
 * @author Aysegul
 */
public class palindromiksayi 
{
    public static void main(String [] args)
    {
        System.out.println("10000'e kadar olan palindromik sayılar : ");
        int sayi;
        for(sayi = 0; sayi < 10000; sayi++)
        {
            if(sayi <= 99 && sayi >= 10)
            {
                if(sayi % 11 == 0)
                {
                    System.out.println(sayi);
                }
            }
            else if (sayi > 99 && sayi < 1000)
            {
                int a = sayi /100;
                int b = sayi % 10; 
                if(a == b){
                    System.out.println(sayi);
                }
            }
            else 
            {
                int binler = sayi / 1000;
                int birler = sayi % 10;
                int yüzler = (sayi % 1000) / 100;
                int onlar = (sayi % 100) / 10;
                if(binler == birler && onlar == yüzler)
                {
                    System.out.println(sayi);
                }
            }
        }
    }   
}
