/* Ödev
Videodaki hesap makinesini switch-case kullanarak yapınız. */

import java.util.Scanner;

public class SwitchCaseHesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz: ");
        n1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        n2 = input.nextInt();

        System.out.println("1 - Toplama\n2 - Cikarma\n3 - Carpma\n4 - Bolme");
        System.out.print("Seciminiz : ");
        select = input.nextInt();

        switch (select) {
            case 1: System.out.println("Toplam : " + (n1 + n2)); break;
            case 2: System.out.println("Fark : " + (n1 - n2)); break;
            case 3: System.out.println("Carpim : " + (n1 * n2)); break;
            case 4: System.out.println("Bolum : " + (n1 / n2)); break;
            default: System.out.println("Yanlis secim yaptiniz. Tekrar deneyiniz."); break;
        }
    }
}

