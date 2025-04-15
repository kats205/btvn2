package backend.Phan2;

import java.util.Scanner;

public class Bai2_7 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ và tên đầy đủ: ");
        String fullName = scanner.nextLine();

        // a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi
        // Loại bỏ khoảng trắng dư thừa ở đầu và cuối
        String trimmedName = fullName.trim();
        // Loại bỏ khoảng trắng dư thừa ở giữa (giữ lại 1 khoảng trắng)
        String normalizedName = trimmedName.replaceAll("\\s+", " ");

        System.out.println("a) Sau khi xóa khoảng trắng dư thừa: \"" + normalizedName + "\"");

        // b) Viết hoa chữ cái đầu mỗi từ
        StringBuilder capitalizedName = new StringBuilder();
        boolean nextIsCapital = true;

        for (int i = 0; i < normalizedName.length(); i++) {
            char c = normalizedName.charAt(i);

            if (Character.isWhitespace(c)) {
                nextIsCapital = true;
                capitalizedName.append(c);
            } else if (nextIsCapital) {
                capitalizedName.append(Character.toUpperCase(c));
                nextIsCapital = false;
            } else {
                capitalizedName.append(Character.toLowerCase(c));
            }
        }

        System.out.println("b) Sau khi viết hoa chữ cái đầu mỗi từ: \"" + capitalizedName.toString() + "\"");
    }
}
