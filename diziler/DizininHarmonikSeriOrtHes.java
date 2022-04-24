/* Ödev
Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi */

package arrays;

public class DiziHarmonikOrt {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        for(int i = 1; i <= numberslength; i++){
            sum += (1.0/i);
        }
        System.out.println("Dizinin harmonik ortalamasi : " + sum/numbers.length);
    }
}
