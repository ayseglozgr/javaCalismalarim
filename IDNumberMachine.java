import java.util.Scanner;
class Challenge{ 
 public static boolean test(String code) {
	try {
		Integer.parseInt(code);
	} catch (NumberFormatException numberFormatException) {
		return false;
	}
	return true;
}
 public static void main(String args[]){ 
 Scanner scanner=new Scanner(System.in); 
 String input;
 System.out.println("Enter the ID number:");  
 input = scanner.next(); 
     if (test(input)==true && input.length()==10 ) {
         System.out.println("correct");
     }
     else {
         System.out.println("incorrect");
     }  
} 
} 