/* Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55
Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın. */

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double avg = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        mat = (mat >= 0 && mat <= 100) ? mat : 0;

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        fizik = (fizik >= 0 && fizik <= 100) ? fizik : 0;

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = input.nextInt();
        turkce = (turkce >= 0 && turkce <= 100) ? turkce : 0;

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        kimya = (kimya >= 0 && kimya <= 100) ? kimya : 0;

        System.out.print("Muzik notunuzu giriniz: ");
        muzik = input.nextInt();
        muzik = (muzik >= 0 && muzik <= 100) ? muzik : 0;
        
        avg = (mat + fizik + turkce + kimya + muzik) / 5;

        if(avg < 55)
        {
            System.out.println("Sinifta kaldiniz, seneye gorusuruz");
        }
        else
        {
            System.out.println("Gectiniz, Tebrikler");
        }
        System.out.println("Ortalamaniz : " + avg);
    }
}
