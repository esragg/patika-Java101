/* 
Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...
/* 

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {

        int matematik, fizik, kimya, turkce, tarih, muzik;
        double ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Turkce notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();
        System.out.print("Muzik notunuzu giriniz: ");
        muzik = input.nextInt();
        ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println("Ortalamaniz: " + ortalama);

        System.out.println(ortalama>60 ? "Gecti" : "Kaldi");
    }
}
