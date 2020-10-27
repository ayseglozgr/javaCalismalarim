/* 
solution of below problem.
---
The parameter weekday is true if it is a weekday, and the parameter vacation 
is true if we are on vacation. We sleep in if it is not a weekday or we're on 
vacation. Return true if we sleep in.
*/
package codingbatornek;

import java.util.Scanner;


public class newClass {
    public static boolean sleepIn(boolean weekday, boolean vacation )
    {
        if(weekday == true && vacation == true)
        {
        return true;   
        }
        else if (weekday == true && vacation == false)
        {
            return false;
        }
        else if (weekday == false && vacation == true)
        {
            return true;
        }
        else
        {
            return true;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean weekday = scanner.nextBoolean();
        boolean vacation = scanner.nextBoolean();
        System.out.println(sleepIn(weekday,vacation));
        
        
    }
    
}
