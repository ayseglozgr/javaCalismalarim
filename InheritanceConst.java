
package nyp9kasim;


class B {
    int xB=10;
    B(){
        metodB();
        System.out.println("B nin constr. calısti.");}
    void metodB(){
        System.out.println("metodB: " + xB);
    }
}

class C extends Test {
    int xC=1;
    int xB=4;
    C(){
        System.out.println("C nin const. calisti. ");
    }
void metodC(){
    System.out.println("metodC");
}void metodB(){
            System.out.println("C sınıfındaki metodB: " + xB);
}
}

public class Test {

    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        System.out.println(b.xB);
        b.metodB();System.out.println(c.xC);
        c.metodB();
    }
}
