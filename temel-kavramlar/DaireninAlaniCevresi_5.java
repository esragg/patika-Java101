/* Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360 */

import java.util.Scanner;

public class DaireninAlaniCevresi {
    public static void main(String[] args) {
        double alan, cevre, PI = 3.14, dilimAlani;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yaricapini giriniz: ");
        int r = input.nextInt();
        System.out.print("Dairenin merkez acisini giriniz \uD835\uDEFC =");
        int aci = input.nextInt();

        alan = PI * r * r;
        cevre = 2 * PI * r;
        dilimAlani = (PI * (r * r) * aci) / 360;

        System.out.println("Alan = " + alan);
        System.out.println("Cevre = " + cevre);
        System.out.println("Dilim alani = " + dilimAlani);
    }
}

