/*
Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

Senaryo
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.
*/
package diziler;

import java.util.Arrays;
import java.util.Scanner;

public class DizininFrekansi {
    static boolean isFound(int[] arr, int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] copyList = new int[list.length];


        System.out.print("Dizi : " + Arrays.toString(list));
        System.out.println("\nTekrar Sayilari");

        int startIndex = 0;
        for(int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if((i != j) && list[i] == list[j]){
                    copyList[startIndex++] = list[i];
                    break;
                }
            }
        }
        Arrays.sort(copyList);


        for(int i = 0; i < copyList.length; i++) {
            int count = 0;
            for (int j = 0; j < copyList.length; j++) {
                if(copyList[i] == copyList[j])
                    count++;
                }
            System.out.println(copyList[i] + " " + count + " kez tekrar edildi.");
            i += count-1;
            }


    }
}
