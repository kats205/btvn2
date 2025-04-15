package backend.Menu;

import backend.Phan1.*;
import utils.ScannerUtils;

public class Phan1 {
    private Bai1_1 bai1_1 = new Bai1_1();
    private Bai1_2 bai1_2 = new Bai1_2();
    private Bai1_3 bai1_3 = new Bai1_3();
    private Bai1_4 bai1_4 = new Bai1_4();
    private Bai1_5 bai1_5 = new Bai1_5();

    private ScannerUtils sc = new ScannerUtils();
    private boolean isRunning = true;

    public void run() {
        while (isRunning) {
            displayMenu();
        }
        System.out.println("\nĐã thoát chương trình. Tạm biệt!");
    }

    public void displayMenu() {
        System.out.println("\n============ Phần 1: Các hàm xuất ============");
        System.out.println("1. Bài 1.1: In số nguyên");
        System.out.println("2. Bài 1.2: In số nguyên có dấu phân cách");
        System.out.println("3. Bài 1.3: In số thực có độ chính xác giới hạn");
        System.out.println("4. Bài 1.4: In chuỗi theo định dạng");
        System.out.println("5. Bài 1.5: In thời gian theo định dạng");
        System.out.println("0. Quay lại menu chính");
        System.out.println("==========================================");
        int choice = sc.inputIntInRange("Nhập lựa chọn của bạn: ", 0, 5);

        switch (choice) {
            case 1:
                bai1_1.run();
                break;

            case 2:
                bai1_2.run();
                break;

            case 3:
                bai1_3.run();
                break;

            case 4:
                bai1_4.run();
                break;

            case 5:
                bai1_5.run();
                break;

            case 0:
                isRunning = false;
                System.out.println("Đang quay lại menu chính...");
                break;

            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
        }
    }
}