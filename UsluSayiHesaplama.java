import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int n, k, total=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi giriniz: ");
        n = input.nextInt();

        System.out.print("Sayinin ussunu giriniz: ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println("Sonuc = " + total);
    }
}
