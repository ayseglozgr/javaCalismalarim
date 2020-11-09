package overload;

public class Overload {   
        void test(int a){
            System.out.println("a " + a);
        }
         void test(int a, int b){
             System.out.println("a and b " + a + "," + b);
         }
        int test (char a){
            System.out.println("char a" );
            return (int)a;
        }
}   
   
class Challenge {   
	public static void main(String args[]) {   
		Overload overload = new Overload();   
		int result;   
		overload.test(10);   
		overload.test(10, 20);   
		result = overload.test('a');   
		System.out.println("Result " + result);   
	}   
}   