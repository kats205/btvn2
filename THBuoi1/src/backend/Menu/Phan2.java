package backend.Menu;

import backend.Phan2.*;
import utils.ScannerUtils;

public class Phan2 {
    private Bai2_1 bai2_1 = new Bai2_1();
    private Bai2_2 bai2_2 = new Bai2_2();
    private Bai2_3 bai2_3 = new Bai2_3();
    private Bai2_4 bai2_4 = new Bai2_4();
    private Bai2_5 bai2_5 = new Bai2_5();
    private Bai2_6 bai2_6 = new Bai2_6();
    private Bai2_7 bai2_7 = new Bai2_7();
    private Bai2_8 bai2_8 = new Bai2_8();
    private Bai2_9 bai2_9 = new Bai2_9();
    private Bai2_10 bai2_10 = new Bai2_10();

    private ScannerUtils sc = new ScannerUtils();
    private boolean isRunning = true;

    public void run() {
        while (isRunning) {
            displayMenu();
        }
        System.out.println("\nĐã thoát chương trình. Tạm biệt!");
    }

    public void displayMenu() {
        System.out.println("\n============ Phần 2: Các hàm xử lý chuỗi ============");
        System.out.println("1. Bài 2.1: Đếm số lượng từ trong xâu");
        System.out.println("2. Bài 2.2: Nối hai xâu ký tự");
        System.out.println("3. Bài 2.3: Viết hoa chữ cái đầu của tên");
        System.out.println("4. Bài 2.4: In từng ký tự trong tên");
        System.out.println("5. Bài 2.5: Nhập họ và tên, in ra họ tên đầy đủ");
        System.out.println("6. Bài 2.6: Tách họ, tên đệm, tên từ họ tên đầy đủ");
        System.out.println("7. Bài 2.7: Chuẩn hóa họ và tên");
        System.out.println("8. Bài 2.8: Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không");
        System.out.println("9. Bài 2.9: Tìm số lần xuất hiện ký tự \"a\" trong chuỗi");
        System.out.println("10. Bài 2.10: Kiểm tra một chuỗi có chứa chữ số hay không");
        System.out.println("0. Quay lại menu chính");
        System.out.println("==================================================");
        int choice = sc.inputIntInRange("Nhập lựa chọn của bạn: ", 0, 10);

        switch (choice) {
            case 1:
                bai2_1.run();
                break;

            case 2:
                bai2_2.run();
                break;

            case 3:
                bai2_3.run();
                break;

            case 4:
                bai2_4.run();
                break;

            case 5:
                bai2_5.run();
                break;
            case 6:
                bai2_6.run();
                break;
            case 7:
                bai2_7.run();
                break;
            case 8:
                bai2_8.run();
                break;
            case 9:
                bai2_9.run();
                break;
            case 10:
                bai2_10.run();
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
