/* Şimdi sıra sende! Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yazarak GitHub reposunu bizimle paylaşmalısın. Kolay gelsin. */
package diziler;

import java.util.Arrays;

public class DiziTekrarEdenElemanlar {
    static boolean isFound(int[] arr, int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1, 2, 2, 10};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for(int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if((i != j) && (list[i] == list[j]) && list[i]%2 == 0){
                    if(!isFound(duplicate, list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                     break;
                }
            }
        }
        for (int value : duplicate){
            if(value != 0)
                System.out.println(value);
        }
    }
}
