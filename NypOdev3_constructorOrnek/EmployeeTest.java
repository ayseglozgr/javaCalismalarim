package nypodev_ikincisoru;

/*
 * @author Aysegul
 */
public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Ayşe", "Özgür", 5000);
        Employee employee2 = new Employee("Gül", "Özgür", 6000);
        System.out.println("Ayşe'nin yıllık maaşı : " + employee1.getAylikMaas() * 12);
        System.out.println("Gül'ün yıllık maaşı : "  + employee2.getAylikMaas() * 12);
        employee1.setAylikMaas(employee1.getAylikMaas() * 1.1);
        employee2.setAylikMaas(employee2.getAylikMaas() * 1.1);
        System.out.println("Ayşe'nin zamlı yıllık maaşı : " + employee1.getAylikMaas() * 12);
        System.out.println("Gül'ün zamli yıllık maaşı : " + employee2.getAylikMaas() * 12);
        
        
    }
}
