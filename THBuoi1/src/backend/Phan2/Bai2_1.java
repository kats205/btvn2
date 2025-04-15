package backend.Phan2;

import java.util.Scanner;

public class Bai2_1 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một xâu ký tự: ");
        String input = scanner.nextLine();

        // Loại bỏ khoảng trắng ở đầu và cuối chuỗi
        input = input.trim();

        // Đếm số từ (nếu chuỗi rỗng thì có 0 từ)
        int wordCount = 0;
        if (!input.isEmpty()) {
            // Tách chuỗi theo một hoặc nhiều khoảng trắng
            String[] words = input.split("\\s+");
            wordCount = words.length;
        }

        System.out.println("Số lượng từ trong xâu: " + wordCount);
    }
}
