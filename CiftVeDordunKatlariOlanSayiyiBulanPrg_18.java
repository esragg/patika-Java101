/*Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve 
girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz. */

import java.util.Scanner;

public class TekSayilarinToplaminiBulanPrg {
    public static void main(String[] args) {
        int k, sum = 0;

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Sayi giriniz:");
            k = input.nextInt();
            if(k % 4 == 0)
                sum += k;
        }while( k > 0);
        System.out.println("Total = " + sum);
    }
}
