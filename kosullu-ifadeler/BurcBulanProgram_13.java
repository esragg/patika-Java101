/*      Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart */
        
import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int ay, gun;
        Scanner input = new Scanner(System.in);

        System.out.print("Dogdugunuz ayi giriniz: ");
        ay = input.nextInt();

        while(!(ay >= 1 && ay <= 12)) {
           System.out.print("ay bilgisini yanlis girdiniz tekrar giriniz (1-12):");
           ay = input.nextInt();
        }

        System.out.print("Dogdugunuz gunu giriniz: ");
        gun = input.nextInt();

        while(!(gun >= 1 && gun <= 31)) {
            System.out.print("gun bilgisini yanlis girdiniz tekrar giriniz (1-31):");
            gun = input.nextInt();
        }

         if (ay == 1) {
             if(gun >= 22)
                 System.out.println("Kova");
             else
                 System.out.println("Oglak");
         } else if (ay == 2) {
             if(gun >= 20)
                 System.out.println("Balik");
             else
                 System.out.println("Kova");
         } else if(ay == 3) {
             if(gun >= 21)
                 System.out.println("Koc");
             else
                 System.out.println("Balik");
         } else if(ay == 4) {
             if(gun >= 21)
                 System.out.println("Boga");
             else
                 System.out.println("Koc");
         } else if(ay == 5) {
             if(gun >= 22)
                 System.out.println("Ikizler");
             else
                 System.out.println("Boga");
         } else if(ay == 6) {
             if(gun >= 23)
                 System.out.println("Yengec");
             else
                 System.out.println("Ikizler");
         } else if(ay == 7) {
             if(gun >= 23)
                 System.out.println("Aslan");
             else
                 System.out.println("Yengec");
         } else if(ay == 8) {
             if(gun >= 23)
                 System.out.println("Basak");
             else
                 System.out.println("Aslan");
         } else if(ay == 9) {
             if(gun >= 23)
                 System.out.println("Terazi");
             else
                 System.out.println("Basak");
         } else if(ay == 10) {
             if(gun >= 23)
                 System.out.println("Akrep");
             else
                 System.out.println("Terazi");
         } else if(ay == 11) {
             if(gun >= 22)
                 System.out.println("Yay");
             else
                 System.out.println("Akrep");
         } else {
             if(gun >= 22)
                 System.out.println("Oglak");
             else
                 System.out.println("Yay");
         }
    }
}
