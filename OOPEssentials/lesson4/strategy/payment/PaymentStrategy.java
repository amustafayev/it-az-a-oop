package lesson4.strategy.payment;

public interface PaymentStrategy {

    void collectPaymentDetails();

    void processPayment(int transferMoney);
}
