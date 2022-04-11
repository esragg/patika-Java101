/* Ödev
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.*/

import java.util.Scanner;

public class DortveBesinKuvvetleri {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        n = input.nextInt();

        System.out.println("Dordun katlari");
        for(int i = 1; i <= n; i *= 4) {
            System.out.print(i + " ");
        }

        System.out.println("\nBesin katlari");
        for(int i = 1; i <= n; i *= 5) {
            System.out.print(i + " ");
        }
    }
}
