/* Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
Senaryo
Sayı Giriniz : 22
22 sayısı ASAL değildir !

Sayı Giriniz : 2
2 sayısı ASALDIR !

Sayı Giriniz : 39
39 sayısı ASAL değildir !

Sayı Giriniz : 17
17 sayısı ASALDIR !*/
package metotlar;

import java.util.Scanner;

public class RecursiveAsalSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int n = input.nextInt();

        asalMi(n,2);
        if (asalMi(n, 2))
            System.out.println(n + " sayısı ASALDIR !");
        else
            System.out.println(n + " sayısı ASAL değildir !");
    }
        static boolean asalMi(int n, int i)
        {
            if (n <= 2)
                return (n == 2) ? true : false;
            if (n % i == 0)
                return false;
            if (i * i > n)
                return true;

            return asalMi(n, i + 1);
        }
    }
