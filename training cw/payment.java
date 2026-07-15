interface Payable {
    void processPayment(double amount);
    String getPaymentStatus();
    void refundPayment(double amount);
}

interface Taxable {
    double calculateTax();
    void generateTaxInvoice();
}

interface Loggable {
    void logActivity(String action);
}

class CreditCardPayment implements Payable, Taxable, Loggable {
    private String status = "pending";
    private double amount;
    private double tax;

    public CreditCardPayment(String cardNumber) {
    }

    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        this.status = "success";
        logActivity("Payment processed: " + amount);
    }

    @Override
    public String getPaymentStatus() {
        return status;
    }

    @Override
    public void refundPayment(double amount) {
        this.amount -= amount;
        this.status = "refunded";
        logActivity("Refund issued: " + amount);
    }

    @Override
    public double calculateTax() {
        this.tax = amount * 0.18; // 18% tax
        return tax;
    }

    @Override
    public void generateTaxInvoice() {
        logActivity("Tax invoice generated. Tax: " + tax);
        System.out.println("Invoice: Amount = " + amount + ", Tax = " + tax);
    }

    @Override
    public void logActivity(String action) {
        System.out.println("Log: " + action);
    }
}
