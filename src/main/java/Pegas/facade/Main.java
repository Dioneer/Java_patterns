package Pegas.facade;

import java.time.LocalDateTime;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        UUID userId = UUID.randomUUID();
        Facade.sendSMS(userId);
    }
}
