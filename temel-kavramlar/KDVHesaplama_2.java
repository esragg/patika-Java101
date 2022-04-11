/* KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız. */

import java.util.Scanner;

public class KDVHesaplama_Odev2 {
    public static void main(String[] args) {
        double para, kdv = 0, kdvTutari, kdvliFiyat;
        Scanner input = new Scanner(System.in);

        System.out.print("Para giriniz: ");
        para = input.nextDouble();

        if (para >= 0 && para <= 1000)
        {
            kdv = 0.18;
        } else if(para > 1000) {
            kdv = 0.08;
        }
        kdvTutari = para * kdv;
        kdvliFiyat = para + kdvTutari;

        System.out.println("KDV'siz Tutar = " + para);
        System.out.println("KDV Orani = " + kdv);
        System.out.println("KDV = " + kdvTutari);
        System.out.println("KDV'li Fiyat = " + kdvliFiyat);

    }
}
