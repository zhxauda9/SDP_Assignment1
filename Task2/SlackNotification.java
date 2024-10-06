package Assignment1.Task2;

public class SlackNotification implements Notification {
    private String slackUser;

    public SlackNotification(String user) {
        this.slackUser = user;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Slack notification sent to: " + slackUser);
        System.out.println("Message that you sent: " + message);
    }
}

