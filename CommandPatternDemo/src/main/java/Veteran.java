
public class Veteran implements DiscountCategory{

	public double applyDiscount(double amount) {
		return amount - (amount * getDiscountAmount());
	}

	public double getDiscountAmount() {
		return 0.05;
	}
}
