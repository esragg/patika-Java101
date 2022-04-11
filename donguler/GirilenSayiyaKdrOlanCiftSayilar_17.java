/*
Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız. */

import java.util.Scanner;

public class GirilenSayiyaKdrOlanCiftSayilar {
    public static void main(String[] args) {
        int k, total = 0, counter = 0;
        double avg;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        k = input.nextInt();

        for(int i = 1; i <= k; i++){
            if(i % 3== 0) {
                if (i % 4 == 0) {
                    counter++;
                    total += i;
                }
            }
        }
        avg = total / counter;
        System.out.println("3 ve 4'e tam bolunen sayilarin ortalamasi: " + avg);
    }
}
