package Assignment1.Task1;

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\nWelcome to the Payment System!");
        double amount = 1000 + (4000 * random.nextDouble());
        System.out.printf("Your amount to pay: %.2f tenge%n", amount);

        System.out.print("\nWould you like to use a promo code? Yes or No? ");
        String promoChoice=scanner.next();
        promoChoice=promoChoice.toLowerCase();
        switch(promoChoice) {
            case "no":
                break;
            case "yes":
                System.out.print("\nEnter the promo code: ");
                String discount = scanner.next();
                amount= Discount.applyPromoCode(discount,amount);
                System.out.printf("Amount after applying the promo code: %.2f Tenge%n",amount);
                break;
            default:
                while (true) {
                    System.out.println("Please enter 'yes' or 'no'.");
                    System.out.print("Do you want to use a promo code? (yes/no): ");
                    String promoChoice1 = scanner.next().toLowerCase();

                    if ("yes".equals(promoChoice1)) {
                        System.out.print("\nEnter the promo code: ");
                        String discountCode = scanner.next();
                        amount = Discount.applyPromoCode(discountCode, amount);
                        System.out.printf("Amount after applying the promo code: %.2f Tenge%n", amount);
                        break;
                    } else if ("no".equals(promoChoice1)) {
                        break;
                    }
                }
                break;
        }
        PaymentMethod paymentMethod = null;
        System.out.print("\nWhat payment method would you like to use?\n\t1 - Credit Card,\n\t2 - PayPal,\n\t3 - Mobile Payment.\nMethod: ");
        int choice = scanner.nextInt();
        switch(choice) {
            case 1:
                System.out.print("Enter card number: ");
                String cardNumber = scanner.next();
                scanner.nextLine();
                System.out.print("Enter CVV: ");
                String cvv = scanner.next();
                scanner.nextLine();
                System.out.print("Enter expiration date (mm/yy): ");
                String expiryDate = scanner.next();
                paymentMethod = new CreditCardPayment(cardNumber, cvv, expiryDate);
                break;
            case 2:
                System.out.print("Enter your email for PayPal: ");
                String email = scanner.next();
                System.out.print("Enter your password for PayPal: ");
                String password = scanner.next();
                paymentMethod = new PayPalPayment(email, password);
                break;
            case 3:
                System.out.print("Enter your phone number: ");
                String phoneNumber = scanner.next();
                paymentMethod = new MobilePayment(phoneNumber);
                break;
            default:
                System.out.print("\nWrong choice.");
                return;
        }
        if (paymentMethod != null) {
            System.out.println();
            paymentMethod.processPayment(amount);
        }

        double remainingBalance = 5000 + (10000 * random.nextDouble());
        System.out.printf("Balance on the card: %.2f Tenge%n", remainingBalance);
        double bonus = remainingBalance * 0.05;
        System.out.printf("You have received bonus: %.2f Tenge%n", bonus);
        System.out.println("Thank you for using our Payment System! Have a nice day!");
    }
}