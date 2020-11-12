
package challenge;


public class Area {

    double area(double a, double b){
        return a * b;
    }

   double area(double r){
       return r * r * 3.14;
   }

   double area(double a, double b, double c){
       double u = (a + b + c) / 2;
       
       return Math.sqrt(u * (u - a) * (u - b) * (u - c));
       
   }
}
