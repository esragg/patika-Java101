import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ebob=1;

        System.out.print("n1 sayisini giriniz: ");
        int n1 = input.nextInt();
        System.out.print("n2 sayisini giriniz: ");
        int n2 = input.nextInt();
        int kucukSayi = (n1 < n2) ? n1 : n2;
        int i = 1;
        while (i <= kucukSayi) {
            if(n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB: "+ ebob);
        System.out.println("EKOK: "+ (n1*n2)/ebob);
    }
}
