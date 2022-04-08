/* Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL

Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL */

import java.util.Scanner;

public class ManavKasaPrg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.67 , domates = 1.11, muz = 0.95, patlican = 5.00, tutar;

        System.out.print("Armut Kac Kilo ? : ");
        armut *= input.nextDouble();
        System.out.print("Elma Kac Kilo ? : ");
        elma *= input.nextDouble();
        System.out.print("Domates Kac Kilo ? : ");
        domates *= input.nextDouble();
        System.out.print("Muz Kac Kilo ? : ");
        muz *= input.nextDouble();
        System.out.print("Patlican Kac Kilo ? : ");
        patlican *= input.nextDouble();

        tutar = armut + elma + domates + muz + patlican;
        System.out.println("Toplam Tuar : " + tutar + " TL");
    }
}
