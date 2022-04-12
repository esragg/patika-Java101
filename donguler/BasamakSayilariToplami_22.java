Ödev
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14
  
/*
Ödev
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14
*/
 Ödev
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        int n, tempNumber, basamakSayisi = 0, lastNumber = 0, basamakSayilariToplami = 0;
        double result = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi giriniz: ");
        n = input.nextInt();
        tempNumber = n;

        while(n != 0) {
            basamakSayisi++;
            n /= 10;
        }
        n = tempNumber;

        while(tempNumber != 0) {
            lastNumber = tempNumber%10;
            result = result + Math.pow(lastNumber, basamakSayisi);
            basamakSayilariToplami += lastNumber;
            tempNumber /= 10;
        }
        System.out.println("Basamak Sayilari Toplami = " + basamakSayilariToplami);
/*
        if(result == n) {
            System.out.println(n+ " sayısı bir Armstrong sayıdır.");
        } else  {
            System.out.println(n+ " sayısı bir Armstrong sayısı değildir.");
        }
*/
    }
}
