package backend.Phan2;

import java.util.Scanner;

public class Bai2_3 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tên: ");
        String name = scanner.nextLine().trim();

        if (!name.isEmpty()) {
            // Chuyển chữ cái đầu thành chữ hoa, giữ nguyên phần còn lại
            char firstChar = Character.toUpperCase(name.charAt(0));
            String restOfName = name.substring(1);

            String capitalizedName = firstChar + restOfName;
            System.out.println("Tên sau khi viết hoa chữ cái đầu: " + capitalizedName);
        } else {
            System.out.println("Tên không được để trống!");
        }
    }
}
