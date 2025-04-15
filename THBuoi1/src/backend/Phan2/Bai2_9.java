package backend.Phan2;

import java.util.Scanner;

public class Bai2_9 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'A') {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện ký tự \"a\" trong chuỗi: " + count);
    }
}
