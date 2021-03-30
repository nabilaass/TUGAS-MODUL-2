//NABILA ASSHAFA PUTRI 20090105

package TUGAS_MODUL2;

public class nomor4_transpose_matriks {
    
      public static void main(String[] args) {
        int[][] Matriks_1 = {
            {2 , 1 , -5},
            {3 , 4 , 2}
        };
        int[][] transpose = new int[5][5];
        for (int i=0 ; i < Matriks_1.length; i++){
            for (int j=0 ; j < Matriks_1[0].length; j++){
                transpose[j][i] = Matriks_1[i][j];
            }
            System.out.println();
        }
        for (int i=0; i < Matriks_1[0].length; i++){
            for (int j=0; j < Matriks_1.length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }}}