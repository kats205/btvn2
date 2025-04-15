package backend.Phan2;

import java.util.Scanner;

public class Bai2_4 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tên của bạn: ");
        String name = scanner.nextLine().trim();

        if (!name.isEmpty()) {
            for (int i = 0; i < name.length(); i++) {
                System.out.println("Ký tự thứ " + (i + 1) + " là: " + name.charAt(i));
            }
        } else {
            System.out.println("Tên không được để trống!");
        }
    }
}
