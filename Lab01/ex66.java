import java.util.Scanner;
public class ex66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] resultMatrix = new int[rows][cols];
        System.out.println("Nhập ma trận 1:");
        inputMatrix(scanner, matrix1, rows, cols);
        System.out.println("Nhập ma trận 2:");
        inputMatrix(scanner, matrix2, rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Ma trận tổng:");
        printMatrix(resultMatrix, rows, cols);
        scanner.close();
    }
    public static void inputMatrix(Scanner scanner, int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
