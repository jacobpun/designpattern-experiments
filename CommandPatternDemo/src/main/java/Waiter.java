
public class Waiter implements Command {

	private Customer customer;
	
	public Waiter(Customer customer){
		this.setCustomer(customer);
	}
	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double executeCalculateBill(double billAmount) {
		
		for(DiscountCategory discountCategory: customer.getEligibleDiscounts()){
			billAmount = discountCategory.applyDiscount(billAmount);
		}
		return billAmount;
	}

}
