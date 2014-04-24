import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Customer {
	
	private List<DiscountCategory> eligibleDiscounts;

	public Customer(){
		eligibleDiscounts = new ArrayList<DiscountCategory>();
	}
	
	public Collection<DiscountCategory> getEligibleDiscounts() {
		Collections.sort(eligibleDiscounts, new Comparator<DiscountCategory>(){

			public int compare(DiscountCategory category1, DiscountCategory category2) {
				return (int)((category1.getDiscountAmount() - category2.getDiscountAmount())*10000);
			}
			
			
		});
		
		return Collections.unmodifiableCollection(eligibleDiscounts);
	}

	public void addEligibleDiscount(DiscountCategory billPayerType) {
		this.eligibleDiscounts.add(billPayerType);
	}
	
}
