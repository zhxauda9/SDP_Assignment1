package Assignment1.Task1;

public interface PaymentMethod {
    //Open/closed principl open for new payment methods ( Banktransfer, Creditcard, Paypal ) but closed for modification.

    // Liskov - used plymorphism, bsuz we replaced w/ objects of a subclass w/out affecting the program

    // Interface Segregation P made fine-grained interface w/ specific methods

    void processPayment(double amount);
}
