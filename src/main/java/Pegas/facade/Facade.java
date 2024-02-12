package Pegas.facade;

import java.time.LocalDateTime;
import java.util.UUID;

public class Facade {
    public static void sendSMS(UUID userID){
        UserService userService = new UserService();
        String userName = userService.getUserName(userID);
        String MESSAGE_TYPE_SMS = "SMS";
        MessageTextService messageTextService = new MessageTextService();
        String message = messageTextService.getShortText(userName, MESSAGE_TYPE_SMS);
        MessageTitleService messageTitleService = new MessageTitleService();
        String messageTitle = messageTitleService.getShortTitle(userName, MESSAGE_TYPE_SMS);
        SendingTimeService sendingTimeService = new SendingTimeService();
        LocalDateTime time = sendingTimeService.getServiceTime(MESSAGE_TYPE_SMS);
        SmsDeliveryService smsDeliveryService = new SmsDeliveryService();
        smsDeliveryService.send(userID,messageTitle,message,time);
    }
}
