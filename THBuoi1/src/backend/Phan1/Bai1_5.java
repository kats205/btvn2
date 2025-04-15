package backend.Phan1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bai1_5 {
    public void run() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH'h':mm'p':ss's'");
        String formattedDateTime = now.format(formatter);
        System.out.println(formattedDateTime);
    }
}
