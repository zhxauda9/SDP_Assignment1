package Assignment1.Task1;

public class MobilePayment implements PaymentMethod {
    // Liskov - used plymorphism, bsuz we replaced w/ objects of a subclass w/out affecting the program
    private String phoneNumber;
    public MobilePayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment by Mobile Payment (Apple Pay/Google Pay/Samsung Pay):");
        System.out.printf("Payment: %.2f тенге%n", amount);
    }
}
