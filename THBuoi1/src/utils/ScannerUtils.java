package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtils {
    private static Scanner scanner;

    public ScannerUtils() {
        scanner = new Scanner(System.in);
    }

    // Nhập số nguyên
    public int inputInt(String message) {
        System.out.print(message);
        while (true) {
            try {
                int number = scanner.nextInt();
                scanner.nextLine(); // Xử lý ký tự xuống dòng
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ!");
                System.out.print(message);
                scanner.nextLine(); // Xóa đầu vào không hợp lệ
            }
        }
    }

    public int inputIntInRange(String message, int min, int max) {
        while (true) {
            int number = inputInt(message);
            if (number >= min && number <= max) {
                return number;
            } else {
                System.out.printf("Lỗi: Vui lòng nhập một số trong khoảng [%d, %d]!\n", min, max);
            }
        }
    }

    // Nhập số thực
    public double inputDouble(String message) {
        System.out.print(message);
        while (true) {
            try {
                double number = scanner.nextDouble();
                scanner.nextLine(); // Xử lý ký tự xuống dòng
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Vui lòng nhập một số thực hợp lệ!");
                System.out.print(message);
                scanner.nextLine(); // Xóa đầu vào không hợp lệ
            }
        }
    }

    // Nhập ký tự
    public static char inputChar(String message) {
        while (true) {
            try {
                System.out.print(message);
                String input = scanner.nextLine();

                if (input.isEmpty()) {
                    throw new IllegalArgumentException("Lỗi: Vui lòng nhập một ký tự!");
                }

                return input.charAt(0);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Nhâp chuỗi
    public static String inputString(String message) {
        String str = "";
        while (true) {
            try {
                System.out.print(message); // Hiển thị lời nhắc nhập
                str = scanner.nextLine().trim();

                if (str.isEmpty()) {
                    throw new IllegalArgumentException("Chuỗi không được trống!");
                }

                return str;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Nhập yes/no
    public static boolean inputYesNo(String message) {
        while (true) {
            try {
                System.out.print(message + " (Y/N): ");
                String input = scanner.nextLine().trim().toUpperCase();

                if (input.equals("Y")) {
                    return true;
                } else if (input.equals("N")) {
                    return false;
                } else {
                    throw new IllegalArgumentException("Lỗi: Vui lòng nhập Y hoặc N!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public void close() {
        if (scanner != null) {
            scanner.close();
        }
    }
}