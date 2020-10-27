// 100 ile 500 arasindaki armstrong sayilari yazdirir.
// armstrong sayi --> abc = (a^3)+(b^3)+(c^3)
package armstrongnumbr;

//@author Aysegul
public class ArmstrongNumbr {

    public static void main(String[] args) {
        int i;
        int yuzlerB;
        int onlarB;
        int birlerB;

        for (i = 100; i <= 500; i++) {
            yuzlerB = i / 100;
            onlarB = (i % 100) / 10;
            birlerB = i % 10;
            if (i == Math.pow(yuzlerB, 3) + Math.pow(onlarB, 3) + Math.pow(birlerB, 3)) {
                System.out.println(i);
            }
        }
    }
}
