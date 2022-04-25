/*
Senaryo
Matris : 
1    2    3    
4    5    6    
Transpoze : 
1    4    
2    5    
3    6     
*/
package diziler;

public class MatrisTranspoze {
    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] copyMatris = new int[3][2];

        System.out.println("Matris : ");
        for (int[] row : matris){
            for(int col : row){
                System.out.print(col+ " ");

            }
            System.out.println();
        }
        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j< matris[i].length; j++){
                copyMatris[j][i] = matris[i][j];
            }
        }

        System.out.println("Transpoze : ");
        for (int[] row : copyMatris){
            for(int col : row){
                System.out.print(col+ " ");

            }
            System.out.println();
        }

    }
}
