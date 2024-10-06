package Assignment1.Task2;

public class EmailNotification implements Notification{
    private String email;

    public EmailNotification(String em) {
        this.email=em;
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("Email notification sent to: "+ email);
        System.out.println("Message that you sent: "+message);
    }
}
