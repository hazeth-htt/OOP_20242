import java.util.Scanner;
public class ex226 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn loại phương trình cần giải:");
            System.out.println("1. Phương trình bậc nhất một ẩn (ax + b = 0)");
            System.out.println("2. Hệ phương trình bậc nhất hai ẩn");
            System.out.println("3. Phương trình bậc hai một ẩn (ax^2 + bx + c = 0)");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Thoát chương trình.");
                break;
            }

            switch (choice) {
                case 1:
                    solveLinearEquation(scanner);
                    break;
                case 2:
                    solveLinearSystem(scanner);
                    break;
                case 3:
                    solveQuadraticEquation(scanner);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }

        scanner.close();
    }

    // Phương trình bậc nhất một ẩn: ax + b = 0
    private static void solveLinearEquation(Scanner scanner) {
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là: x = " + x);
        }
    }

    // Hệ phương trình bậc nhất hai ẩn
    private static void solveLinearSystem(Scanner scanner) {
        System.out.println("Nhập các hệ số của hệ phương trình:");
        System.out.print("Nhập a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Nhập a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Nhập b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Nhập a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Nhập a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Nhập b2: ");
        double b2 = scanner.nextDouble();

        // Tính các định thức
        double D = a11 * a22 - a12 * a21;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Hệ phương trình có vô số nghiệm.");
            } else {
                System.out.println("Hệ phương trình vô nghiệm.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Nghiệm của hệ phương trình: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    // Phương trình bậc hai: ax^2 + bx + c = 0
    private static void solveQuadraticEquation(Scanner scanner) {
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("a = 0, phương trình trở thành phương trình bậc nhất.");
            solveLinearEquation(scanner);
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: x = " + x);
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }
}
