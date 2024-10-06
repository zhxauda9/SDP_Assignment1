package Assignment1.Task1;

public class Discount {
    public static double applyPromoCode(String promoCode, double amount) {

        if ("assignment1".equalsIgnoreCase(promoCode)) {
            System.out.println("Promo code activated. 20% discount");
            return amount * 0.8;
        }else if ("assignment2".equalsIgnoreCase(promoCode)){
            System.out.println("Promo code activated. 10% discount");
            return amount * 0.9;
        }else if ("softwaredesignpatterns".equalsIgnoreCase(promoCode)) {
            System.out.println("Promo code activated. 50% discount");
            return amount * 0.5;
        }else if ("se2307".equalsIgnoreCase(promoCode)) {
            System.out.println("Promo code activated. 70% discount");
            return amount * 0.3;
        }else if ("solid".equalsIgnoreCase(promoCode)){
            System.out.println("Promo code activated. 25% discount");
            return amount * 0.75;
        }else if ("creational".equalsIgnoreCase(promoCode)){
            System.out.println("Promo code activated. 30% discount");
            return amount * 0.7;
        }else if ("structural".equalsIgnoreCase(promoCode)){
            System.out.println("Promo code activated. 30% discount");
            return amount * 0.7;
        }else if ("ShukurovaTeacher".equalsIgnoreCase(promoCode)){
            System.out.println("Promo code activated. 85% discount");
            return amount * 0.15;
        }
        else{
            System.out.println("Invalid promo code.");
            return amount;
        }
    }
}

