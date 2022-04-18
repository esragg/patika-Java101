/* Recursive Metotlar ile Üslü Sayı Hesaplama
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

Senaryo

Taban değeri giriniz :2
Üs değerini giriniz : 0
Sonuç : 1
Taban değeri giriniz : 2
Üs değerini giriniz : 3
Sonuç : 8
Taban değeri giriniz : 5
Üs değerini giriniz : 3
Sonuç : 125 */

package metotlar;

import java.util.Scanner;

public class RecursiveUsluSayiHes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int sayi = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int us = input.nextInt();
        System.out.println(usHesaplama(sayi,us));
    }
    static int usHesaplama(int sayi, int us){
        if(us == 0)
            return 1;

        return sayi * usHesaplama(sayi, us-1);
    }
}
