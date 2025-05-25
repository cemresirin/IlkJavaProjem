import java.util.Scanner;

public class MatrisToplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matris1 = new int[2][2];
        int[][] matris2 = new int[2][2];
        int[][] toplamMatris = new int[2][2];

        System.out.println("1.matrisi girin (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("matris1[" + i + "][" + j + "]: ");
                matris1[i][j] = input.nextInt();
            }
        }
        System.out.println("2.Matrisi girin (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("matris2[" + i + "][" + j + "]: ");
                matris2[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                toplamMatris[i][j] = matris1[i][j] + matris2[i][j];
            }
        }
        System.out.println("Toplam Matris:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(toplamMatris[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
