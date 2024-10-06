package Assignment1.Task2;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Notification> notifications = new LinkedList<>();

        System.out.println("Welcome to our Notification System! ");
        System.out.print("How many notifications do you want to send? ");
        int numberOfNotifications = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<numberOfNotifications;i++){
            System.out.print("\nWhat notification channel would you like to use?\n\t1 - SMSNotification,\n\t2 - EmailNotification,\n\t3 - PushNotification.\n\t4 - SlackNotification.\nNotification: ");
            int notChoise=sc.nextInt();
            sc.nextLine();
            Notification notification = null;
            switch (notChoise) {
                case 1:
                    System.out.print("Enter the phone number you want to send SMS Notification for: ");
                    String num = sc.next();
                    notification = new SMSNotification(num);
                    break;
                case 2:
                    System.out.print("Enter the email you want to send Email Notification for: ");
                    String email = sc.next();
                    notification = new EmailNotification(email);
                    break;
                case 3:
                    System.out.print("Enter the device ID you want to send Push Notification for: ");
                    int id = sc.nextInt();
                    notification = new PushNotification(id);
                    break;
                case 4:
                    System.out.println("Enter the Slack username you want to send Slack Notification for: ");
                    String username = sc.next();
                    notification = new SlackNotification(username);
                    break;
                default:
                    System.out.println("Invalid choice. Exiting...");
                    i--;
                    continue;
            }
            sc.nextLine();
            System.out.print("Enter your message: ");
            String message = sc.nextLine();
            if (notification != null) {
                notification.sendNotification(message);
                notifications.add(notification);
            }
        }
        System.out.println("Would you like to send a Bulk Notification? (yes or no): ");
        String bulkChoice = sc.nextLine().toLowerCase();
        if (bulkChoice.equals("yes")) {
            System.out.print("Enter the message for bulk notification: ");
            String bulkMessage = sc.nextLine();
            sendBulkNotifications(notifications, bulkMessage); // Метод для отправки массовых уведомлений
        }
        sc.close();
        System.out.println("Thank you for using Notification system!");
    }
    public static void sendBulkNotifications(List<Notification> notifications, String message) {
        for (Notification notification : notifications) {
            notification.sendNotification(message);
        }
    }
}
