package lab1;

import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("Menu giải phương trình:");
            System.out.println("1. Giải phương trình bậc một (ax + b = 0)");
            System.out.println("2. Giải hệ phương trình bậc nhất (ax1 + bx2 = c1, ax1 + bx2 = c2)");
            System.out.println("3. Giải phương trình bậc hai (ax^2 + bx + c = 0)");
            System.out.println("4. Thoát");
            System.out.print(" Nhập lựa chọn của bạn (1/2/3/4): ");
            int choice = scanner.nextInt();

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
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập 1, 2, 3 hoặc 4.");
            }
        }

        scanner.close();
    }

    //giai phuong trinh bac nhat
    private static void solveLinearEquation(Scanner scanner) {
        System.out.print("Nhập giá trị a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập giá trị b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Đây không phải dạng phương trình bậc nhất.");
        } else {
            double x = -b / a;
            System.out.println("x = " + x);
        }
    }

    // Giải hệ phương trình bậc nhất (ax1 + bx2 = c1, ax1 + bx2 = c2)
    private static void solveLinearSystem(Scanner scanner) {
        System.out.print("Nhập giá trị của a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Nhập giá trị của a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Nhập giá trị của b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Nhập giá trị của c1: ");
        double c1 = scanner.nextDouble();
        System.out.print("Nhập giá trị của a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Nhập giá trị của a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Nhập giá trị của b2: ");
        double b2 = scanner.nextDouble();
        System.out.print("Nhập giá trị của c2: ");
        double c2 = scanner.nextDouble();

        double determinantD = a11 * a22 - a21 * a12;
        double determinantD1 = c1 * a22 - c2 * a12;
        double determinantD2 = a11 * c2 - a21 * c1;

        if (determinantD != 0) {
            double x1 = determinantD1 / determinantD;
            double x2 = determinantD2 / determinantD;
            System.out.println("Nghiệm: x1 = " + x1 + ", x2 = " + x2);
        } else {
            if (determinantD1 == 0 && determinantD2 == 0) {
                System.out.println("Vô số nghiệm.");
            } else {
                System.out.println("Vô nghiệm.");
            }
        }
    }

    // Giải phương trình bậc 2 (ax^2 + bx + c = 0)
    private static void solveQuadraticEquation(Scanner scanner) {
        System.out.print("Nhập giá trị của a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập giá trị của b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập giá trị của c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Đây không phải là phương trình bậc hai.");
        } else if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Nghiệm kép: x = " + x);
        } else {
            System.out.println("Vô nghiệm.");
        }
    }
}
