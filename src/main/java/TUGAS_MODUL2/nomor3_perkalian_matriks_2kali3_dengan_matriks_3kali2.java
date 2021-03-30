//NABILA ASSHAFA PUTRI NIM 20090105

package TUGAS_MODUL2;

public class nomor3_perkalian_matriks_2kali3_dengan_matriks_3kali2 {
    public static void main(String[] args) {
    int[][] matriks_1 = {
      {10, 10, 10},
      {10, 10, 10},
    };
    int[][] matriks_2 = {
      {10, 10},
      {10, 10},
      {10, 10}
    };
    if(matriks_1[0].length == matriks_2.length) {
      int[][] matriks_3 = new int[matriks_1.length][matriks_2[0].length];
      for(int i=0; i <matriks_1.length; i++) {
        for(int j=0; j < matriks_2[0].length; j++) {
            matriks_3[i][j] = matriks_1[i][j] * matriks_2[i][j];
          }
        }
    for (int[] x: matriks_3 ){
            for (int y: x){
                System.out.print(y+" ");
            }
            System.out.println();
    }
      }}}