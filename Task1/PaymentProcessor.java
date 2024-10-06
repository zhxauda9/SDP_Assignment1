package Assignment1.Task1;

public class PaymentProcessor {
    // DIP - bcuz it depends on the abstraction PaymentMethod, not concrete implementations
    private PaymentMethod paymentMethod;
    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void process(double amount) {
        paymentMethod.processPayment(amount);
    }
}
