/*
Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

Senaryo
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22 */

import java.util.Scanner;

public class NSayiEnBuyukEnKucuk {
    public static void main(String[] args) {
        int N;

        Scanner input = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz ? : ");
        N = input.nextInt();
        int i = 1, enKucuk=0, enBuyuk=0;
        while (i <= N) {
            System.out.print(i + ". sayiyi giriniz: ");
            int sayi = input.nextInt();
            if(sayi>enBuyuk)
                enBuyuk = sayi;
            if(sayi<enKucuk)
                enKucuk = sayi;
            i++;
        }
        System.out.println("En kucuk sayi: " + enKucuk);
        System.out.println("En buyuk sayi: " + enBuyuk);
    }
}
