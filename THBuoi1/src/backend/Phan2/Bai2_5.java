package backend.Phan2;

import java.util.Scanner;

public class Bai2_5 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ của bạn: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Nhập tên của bạn: ");
        String firstName = scanner.nextLine().trim();

        // Ghép họ và tên thành họ tên đầy đủ
        String fullName = lastName + " " + firstName;

        System.out.println("Họ và tên đầy đủ: " + fullName);
    }
}
