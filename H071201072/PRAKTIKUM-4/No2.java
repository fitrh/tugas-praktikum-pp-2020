import java.util.Scanner;
public class No2 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int i = inputan.nextInt();
        int j = inputan.nextInt();
        int k = inputan.nextInt();
        int[][] matriks_A = new int[i][j];
        int[][] matriks_B = new int[j][k];
        int[][] matriks_hasil = new int[i][k];

        // input data matriks_A
        for (int i2 = 0; i2 < i; i2++) {
            for (int j2 = 0; j2 < j; j2++) {
                matriks_A[i2][j2] = inputan.nextInt();
            }
        }            

        // input data matriks_B
        for (int j2 = 0; j2 < j; j2++) {
            for (int k2 = 0; k2 < k; k2++) {
                matriks_B[j2][k2] = inputan.nextInt();
            }
        }

        // operasi perkalian matriks
        for (int i2 = 0; i2 < i; i2++) {
            for (int k2 = 0; k2 < k; k2++) {
                matriks_hasil[i2][k2] = (matriks_A[i2][0]*matriks_B[0][k2])+(matriks_A[i2][1]*matriks_B[1][k2]);
            }
        }

        // cetak matriks hasil
        for (int i2 = 0; i2 < i; i2++) {
            for (int k2 = 0; k2 < k; k2++) {
                System.out.print(matriks_hasil[i2][k2]+ " ");
            } System.out.println();
        }
    }
}
