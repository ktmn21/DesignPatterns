public interface PaymentMethods {

    void pay();

    PaymentMethods payWithCard =
            () -> System.out.println("Payment made with card");

    PaymentMethods payByBankTransfer =
            () -> System.out.println("Payment made by Bank transfer");

}
