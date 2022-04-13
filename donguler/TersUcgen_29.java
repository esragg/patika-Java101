/*
Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

Örnek
Basamak Sayısı : 10

 *******************
  *****************
   ***************
    *************
     ***********
      *********
       *******
        *****
         ***
          *
          
 */
import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayisini giriniz: ");
        int n = input.nextInt();
        System.out.println("Basamak Sayisi : " + n);

        for(int i = 0; i <= n; i++){
            for(int k = 1; k <= i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j < 2*(n-i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

