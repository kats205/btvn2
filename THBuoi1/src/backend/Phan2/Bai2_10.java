package backend.Phan2;

import java.util.Scanner;

public class Bai2_10 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        boolean containsDigit = false;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                containsDigit = true;
                break;
            }
        }

        // Nếu chứa chữ số, in ra false; ngược lại, in ra true
        System.out.println(!containsDigit);
    }
}
