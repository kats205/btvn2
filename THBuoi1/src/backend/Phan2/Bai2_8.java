package backend.Phan2;

import java.util.Scanner;

public class Bai2_8 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi thứ nhất: ");
        String str1 = scanner.nextLine();

        System.out.print("Nhập chuỗi thứ hai: ");
        String str2 = scanner.nextLine();

        // Kiểm tra xem chuỗi thứ hai có phải là đảo ngược của chuỗi thứ nhất
        boolean isReverse = isReverse(str1, str2);

        if (isReverse) {
            System.out.println("OK");
        } else {
            System.out.println("KO");

        }
    }

    private boolean isReverse(String str1, String str2) {
        // Nếu hai chuỗi có độ dài khác nhau, chắc chắn không phải đảo ngược
        if (str1.length() != str2.length()) {
            return false;
        }

        // So sánh từng ký tự của str1 với ký tự tương ứng đảo ngược của str2
        int length = str1.length();
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) != str2.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
