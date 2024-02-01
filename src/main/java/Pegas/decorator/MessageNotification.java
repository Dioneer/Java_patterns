package Pegas.decorator;

public class MessageNotification implements Notification{
    public MessageNotification() {
    }
    private Notification notification;
    public MessageNotification(Notification notification) {
        this.notification = notification;
    }
    @Override
    public void send() {
        if(notification!= null){notification.send();}
        System.out.println("Send messager message");
    }
}
