/*
Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

Senaryo
Dizinin boyutu n : 5
Dizinin elemanlarını giriniz :
1. Elemanı : 99
2. Elemanı : -2
3. Elemanı : -2121
4. Elemanı : 1
5. Elemanı : 0
Sıralama : -2121 -2 0 1 99
*/
package diziler;
import java.util.Arrays;
import java.util.Scanner;

public class DizideElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();
        int[] dizi = new int[n];

        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < n; i++)
        {
            System.out.print(i+1 + ". elemani giriniz : ");
            dizi[i] = input.nextInt();
        }

        Arrays.sort(dizi);
        System.out.print("Siralama : ");

        for (int i : dizi){
            System.out.print(i + " ");
        }
    }
}
