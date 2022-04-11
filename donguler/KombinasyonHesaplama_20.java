/*
Ödev
        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
         N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
 */
import java.util.Scanner;
public class KombinasyonHesaplama {
    public static void main(String[] args) {
        int n, r, nf = 1, nr = 1, nfr = 1;
        double combination;

        Scanner input = new Scanner(System.in);
        System.out.print("n giriniz: ");
        n = input.nextInt();
        System.out.print("r giriniz: ");
        r = input.nextInt();
        for(int i = 1; i <= n; i++) {
            nf = nf * i;
        }
        for(int i = 1; i <= r; i++) {
            nr = nr * i;
        }
        for(int i = 1; i <= (n-r); i++) {
            nfr = nfr * i;
        }
        combination = nf / (nr * nfr);
        System.out.println("C(n,r) = " + combination);
    }
}
