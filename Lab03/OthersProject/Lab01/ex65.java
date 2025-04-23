import java.util.Arrays;
import java.util.Scanner;
public class ex65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] myArray = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }
        Arrays.sort(myArray);
        int sum = 0;
        for (int num : myArray) {
            sum += num;
        }
        double average = (double) sum / n;
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(myArray));
        System.out.println("Tổng của các phần tử: " + sum);
        System.out.println("Giá trị trung bình: " + average);
        scanner.close();
    }
}
