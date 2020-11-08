
package javaapplication42;


import java.util.Scanner;
class A{
    static int i,j;
    
    
    A(int a, int b){
        i = a;
        j = b;
    }
   
    static void show() {
        System.out.println("i and j:" + i + " " + j);
    }
}

class B extends A{
   static int k;
    
    B(int a, int b, int c){
        super(a, b);
        k = c;
    }
    
    static void show() {
        System.out.println("k : " + k);
    }
    
    
}
class Challenge extends B{

 public static void main(String args[]){
 Scanner scanner=new Scanner(System.in);
 int sum=0;

 System.out.println("Enter the 1st number:");
 int num1=scanner.nextInt();
 System.out.println("Enter the 2nd number:");
 int num2=scanner.nextInt();
 System.out.println("Enter the 3rd number:");
 int num3=scanner.nextInt();
 B obj = new B(num1,num2,num3);
 show();

}

}

