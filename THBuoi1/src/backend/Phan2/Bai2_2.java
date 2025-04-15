package backend.Phan2;

import java.util.Scanner;

public class Bai2_2 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập xâu ký tự thứ nhất (s1): ");
        String s1 = scanner.nextLine();

        System.out.print("Nhập xâu ký tự thứ hai (s2): ");
        String s2 = scanner.nextLine();

        // Nối s2 vào sau s1
        String result = s1 + s2;

        System.out.println("Xâu sau khi nối: " + result);
    }
}
