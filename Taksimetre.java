/* Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir. */

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kac km gittiniz? :");
        int gidilenKm = input.nextInt();

        int taksimetreAcilis = 10;
        double km = 2.20;

        double ucret = (km * gidilenKm) + taksimetreAcilis;

        ucret = (ucret < 20) ? 20 : ucret;
        System.out.println("Ucret = " + ucret + " TL");

    }
}

