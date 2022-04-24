/*
Ödev
Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

Dizi : {15,12,788,1,-1,-778,2,0}
Girilen Sayı : 5
Girilen sayıdan küçük en yakın sayı : 2
Girilen sayıdan büyük en yakın sayı : 12
*/

package diziler;

import java.util.Arrays;
import java.util.Scanner;

public class GirileneEnYakinKucukBuyukSayi {
    public static void main(String[] args) {
        int[] dizi = {15,12,788,1,-1,-778,2,0};
        int[] diziCopy = Arrays.copyOf(dizi,9);

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int n = input.nextInt();


        diziCopy[dizi.length] = n;
        Arrays.sort(diziCopy);
        int location = Arrays.binarySearch(diziCopy,n);
        int kucukSayi = diziCopy[location-1];
        int buyukSayi = diziCopy[location+1];

        System.out.println("Dizi : " + Arrays.toString(dizi));
        System.out.println("Girilen Sayi: "+ n);
        System.out.println("Girilen sayıdan küçük en yakın sayı :" + kucukSayi);
        System.out.println("Girilen sayıdan büyük en yakın sayı :" + buyukSayi);

    }
}
