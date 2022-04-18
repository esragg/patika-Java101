/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın. 
Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

Senaryolar
N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16 

N Sayısı : 10
Çıktısı : 10 5 0 5 10 

N Sayısı : 25
Çıktısı : 25 20 15 10 5 0 5 10 15 20 25 

N Sayısı : 5
Çıktısı : 5 0 5  
*/
package metotlar;

import java.util.Scanner;

public class RecursiveDeseneGoreMetotOlusturma {
    static int count = 0;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int n = input.nextInt();
        pattern(n,n);

    }

    static void pattern(int n, int m){
        String desen = "";

            if(n > 0 && count == 0) {
                System.out.print(n + " ");
                pattern(n-5, m);
            } else if (n <= 0 || count == 1){
                count = 1;
                System.out.print(n + " ");

                if (n < m)
                 pattern(n+5,m);
            }
      }

}
