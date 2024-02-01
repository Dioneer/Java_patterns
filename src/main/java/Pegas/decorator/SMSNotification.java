package Pegas.decorator;

public class SMSNotification implements Notification{
    private Notification notification;
    public SMSNotification(Notification notification) {
        this.notification = notification;
    }
    public SMSNotification() {
    }
    @Override
    public void send() {
        if(notification!= null){notification.send();}
        System.out.println("Send sms message");
    }
}
