package Assignment1.Task1;

public class PayPalPayment implements PaymentMethod {
    // Liskov - used plymorphism, bsuz we replaced w/ objects of a subclass w/out affecting the program
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment by PayPal:");
        System.out.printf("Payment: %.2f тенге%n", amount);
    }
}