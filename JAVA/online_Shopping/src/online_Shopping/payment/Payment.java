/*
 * Name: Ravi Chauhan
 * Roll No: 37
 * Context: Payment class managing transaction attributes and payment processing.
 */

package online_Shopping.payment;

public class Payment {
    private int paymentId;
    private double amount;
    private String paymentMethod;
    private String paymentStatus;
    private String transactionRef;

    public Payment() {
    }

    public Payment(int paymentId, double amount, String paymentMethod, String paymentStatus, String transactionRef) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.transactionRef = transactionRef;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getTransactionRef() {
        return transactionRef;
    }

    public void setTransactionRef(String transactionRef) {
        this.transactionRef = transactionRef;
    }

    public void processPayment() {
        this.paymentStatus = "COMPLETED";
        System.out.println("Payment of " + this.amount + " processed.");
    }
}