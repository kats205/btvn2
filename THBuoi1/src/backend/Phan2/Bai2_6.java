package backend.Phan2;

import java.util.Scanner;

public class Bai2_6 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ và tên đầy đủ: ");
        String fullName = scanner.nextLine().trim();

        // Tách các phần của họ tên
        String[] parts = fullName.split("\\s+");

        if (parts.length >= 3) {
            // Trường hợp có họ, tên đệm, tên
            String lastName = parts[0];

            // Tên đệm là tất cả các từ ở giữa (không phải họ và tên)
            StringBuilder middleName = new StringBuilder();
            for (int i = 1; i < parts.length - 1; i++) {
                middleName.append(parts[i]);
                if (i < parts.length - 2) {
                    middleName.append(" ");
                }
            }

            String firstName = parts[parts.length - 1];

            System.out.println("Họ là: " + lastName);
            System.out.println("Tên đệm là: " + middleName.toString());
            System.out.println("Tên là: " + firstName);
        } else if (parts.length == 2) {
            // Trường hợp chỉ có họ và tên (không có tên đệm)
            System.out.println("Họ là: " + parts[0]);
            System.out.println("Tên đệm là: ");
            System.out.println("Tên là: " + parts[1]);
        } else if (parts.length == 1) {
            // Trường hợp chỉ có tên
            System.out.println("Họ là: ");
            System.out.println("Tên đệm là: ");
            System.out.println("Tên là: " + parts[0]);
        } else {
            System.out.println("Họ và tên không hợp lệ!");
        }
    }
}
