//NABILA ASSHAFA PUTRI NIM 20090105

package TUGAS_MODUL2;

public class nomor2_pengurangan_matriks_3kali2 {
    
    public static void main (String[] args){
        int [] [] matrix_pertama = {
            {22 , 22},
            {22 , 22},
            {22 , 22}
        };
        int [][] matrix_kedua = {
            {20 , 20},
            {20 , 20},
            {20 , 20},
        };
        int [][] jumlahpengurangan = new int[matrix_pertama.length][matrix_pertama[0].length];
        if (matrix_pertama.length == matrix_kedua.length && matrix_pertama[0].length == matrix_kedua[0].length){
            for (int i=0 ; i < matrix_pertama.length ; i++){   
                for (int j=0 ; j < matrix_pertama[0].length ; j++){
                jumlahpengurangan [i][j] = matrix_pertama[i][j] - matrix_kedua [i][j]; 
                System.out.print (jumlahpengurangan [i][j] + " ");
            }
            System.out.println();
            }
        }
        else{
            System.out.print("ukurannya tidak sama");
        }
    }
}
