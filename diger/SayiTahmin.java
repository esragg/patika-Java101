import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int)(Math.random()*100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5)
        {
            System.out.print("Lutfen tahmininizi giriniz : ");
            selected = input.nextInt();
            if(selected < 0 || selected > 99){
                System.out.println("Lutfen 0-100 arasinda bir deger giriniz.");
                if(isWrong){
                    right++;
                    System.out.println("Cok fazla hatali girdiniz. Kalan hak: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir dahaki hatali girisinizde hakkinizdan dusulecektir.");

                }
                continue;
            }
            if(selected == number){
                System.out.println("Tebrikler, dogru tahmin! Tahmin ettiginiz sayi: " + number);
                isWin = true;
                break;
            } else {

                System.out.println("Hatali bir sayi girdiniz!");
                if(selected > number)
                    System.out.println(selected + " sayisi, gizli sayidan buyuktur.");
                else
                    System.out.println(selected + " sayisi, gizli sayidan kucuktur.");
            }
            wrong[right++] = selected;
            System.out.println("Kalan hak: " + (5-right));

        }

        if(!isWin){
            System.out.println("Kaybettiniz!");
            if(!isWrong)
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
        }

        System.out.println("Gizli sayi: " + number);
    }
}
