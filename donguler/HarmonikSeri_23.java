import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        int n;
        double harmonikSeri = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("n giriniz: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++){
            harmonikSeri += (1.0/i);
            System.out.println(harmonikSeri);
        }
        System.out.println(n + " Harmonik serisi: " + harmonikSeri);
    }
}
