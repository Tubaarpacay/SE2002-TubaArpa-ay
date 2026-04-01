public class NoDiscount implements  DiscountStrategy{
    public double apply(double price) {
        return price;
    }
}
