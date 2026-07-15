import java.util.*;
class Order{
    protected String orderId;
    protected double totalAmount;
    protected String orderDate;

    // parent constructor --parameterized constructor
    public Order(String orderId, double totalAmount) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.orderDate = new Date().toString();
        System.out.println("Order Created with ID: " + orderId + " and Total Amount: " + totalAmount);
}

//parent method
public double calculateDiscount() {
    return totalAmount * 0.05;

}
public double calculateCurrentDiscount() {
    return totalAmount * 0.05;
}
public void displayOrder(){
    System.out.println("Order ID: " + orderId);
    System.out.println("Total Amount: " + totalAmount);
    System.out.println("Order Date: " + orderDate);
}
}
class PremiumOrder extends Order{
    private String membershipTier;
    private double cashback;

    // using super keyword to call parent constructor
    public PremiumOrder(String orderId, double totalAmount, String membershipTier) {
        super(orderId, totalAmount);
        this.membershipTier = membershipTier;
        this.cashback = totalAmount * 0.1; // 10% cashback for premium members
        System.out.println("Premium Order Created with Cashback: " + cashback);
        System.out.println("premium order with" + membershipTier+ "membership tier");
    }
    @Override
    public double calculateCurrentDiscount() {
        double baseDiscount = super.calculateDiscount();
               double finalDiscount = baseDiscount ;
        System.out.println("discount applied: " + finalDiscount);
        return finalDiscount;
    }
    //overriding with super keyword to call parent method
    @Override
    public double calculateDiscount() {
        double baseDiscount = super.calculateDiscount();
        double PremiumDiscount = totalAmount * 0.1; // Additional 10% discount for premium members
        double finalDiscount = baseDiscount + PremiumDiscount;
        System.out.println("Premium discount applied: " + finalDiscount);
        return finalDiscount;
    }
    @Override
    public void displayOrder() {
        super.displayOrder();
        System.out.println("Membership Tier: " + membershipTier);
        System.out.println("Cashback: " + cashback);
    }
}
//usage
public class EcommerceApp{
    public static void main(String[] args){
        PremiumOrder order = new PremiumOrder("ORD123", 5000.0, "Gold");
         order.displayOrder();
         order.calculateCurrentDiscount();
         order.calculateDiscount();
    }
}