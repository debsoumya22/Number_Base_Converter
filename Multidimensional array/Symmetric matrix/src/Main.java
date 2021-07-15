import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matrixSize = scan.nextInt();
        int[][] matrix = new int[matrixSize][matrixSize];
        boolean isSymmetric = true;

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                }
            }
        }

        System.out.println(isSymmetric ? "YES" : "NO");
    }
}
