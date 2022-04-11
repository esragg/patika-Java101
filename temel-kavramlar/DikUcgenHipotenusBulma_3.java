/* Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)     */
import java.util.Scanner;

public class DikUcgenHipotenusBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Kenarlari giriniz.");
        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();
        double c = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenus = " + (int) c);
        double u = (a + b + c) / 2;
        double cevre = 2 * u;
        System.out.println("Ucgenin cevresi = " +  (int) cevre);
        double alan = Math.sqrt( u * (u - a) * (u - b) * (u - c));
        System.out.println("Ucgenin alani = " + (int) alan);

    }
}
