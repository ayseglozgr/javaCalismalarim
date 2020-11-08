 
package mesaj;
import javax.swing.*;//j option metodu için
public class Mesaj {
    
    public static void main(String[] args) {
 DegiskenTutan a = new DegiskenTutan();
 DegiskenTutan b = new DegiskenTutan();
a.setX(10);
b.setX(20);
b.x=20;
        System.out.println(b.getX()+a.getX());
        JOptionPane.showMessageDialog(null,b.x);
    }
    
}
