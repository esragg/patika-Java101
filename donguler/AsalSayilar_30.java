/*
Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

Senaryo
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
*/

import java.util.Scanner;

public class AsalSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;

        int sayi = 2;
        while (sayi<=100){
            for(int i = 2; i < sayi; i++) {
                if (sayi % i == 0)
                    counter++;
            }
            if(counter == 0)
                System.out.print(sayi + " ");

        sayi++;
        counter = 0;
        }

    }
}
