/* Ödev
Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız. */
import java.util.Scanner;

public class SayilariKucuktenBuyugeSiralama {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayiyi giriniz: ");
        a = input.nextInt();
        System.out.print("2. Sayiyi giriniz: ");
        b = input.nextInt();
        System.out.print("3. Sayiyi giriniz: ");
        c = input.nextInt();

        if((a < b) && ( a < c)) {
            if(b < c) {
                System.out.println(" a < b < c");
            } else {
                System.out.println(" a < c < b");
            }
        } else if ((b < a) && (b < c)) {
            if(a < c) {
                System.out.println(" b < a < c");
            } else {
                System.out.println(" b < c < a");
            }
        } else {
            if(b < a) {
                System.out.println(" c < b < a");
            } else {
                System.out.println(" c < a < b");
            }
        }
    }
}
