public class PersonOver60 implements DiscountCategory {

	public double applyDiscount(double amount) {
		return amount - (amount * getDiscountAmount());
	}

	public double getDiscountAmount() {
		return 0.05;
	}
}
