package Assignment1.Task2;

public class PushNotification implements Notification{
    private int deviceID;

    public PushNotification(int em) {
        this.deviceID=em;
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("Push notification sent to device:"+ deviceID);
        System.out.println("Message that you sent: "+message);
    }
}
