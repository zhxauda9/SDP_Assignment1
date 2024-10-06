package Assignment1.Task2;


public class SMSNotification implements Notification{
    private String pNumber;
    public SMSNotification(String num){
        this.pNumber=num;
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS notification sent to: "+ pNumber);
        System.out.println("Message that you sent: "+message);
    }
}

