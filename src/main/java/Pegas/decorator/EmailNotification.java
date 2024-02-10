package Pegas.decorator;

public class EmailNotification implements Notification {
    public EmailNotification(Notification notification) {
        this.notification = notification;
    }
    public EmailNotification() {}
    private Notification notification;
    public void send(){
        if(notification!= null){notification.send();}
        System.out.println("Send e-mail message");
    }
}
