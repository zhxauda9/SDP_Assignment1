package Assignment1.Task1;

public class CreditCardPayment implements PaymentMethod {
    // Liskov - used plymorphism, bsuz we replaced w/ objects of a subclass w/out affecting the program
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardPayment(String cardNumber, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment by Credit Card:");
        System.out.printf("Payment: %.2f тенге%n", amount);
    }
}
