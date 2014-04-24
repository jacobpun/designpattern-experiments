import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;


public class WaiterIntegrationTest {

	@Test
	public void shouldCalculateFinalBill() {
		Customer veteranOver60 = new Customer();
		veteranOver60.addEligibleDiscount(new PersonOver60());
		veteranOver60.addEligibleDiscount(new Veteran());
		Waiter waiter = new Waiter(veteranOver60);
		double billAfterApplyingDiscounts = waiter.executeCalculateBill(100.00);
		assertThat(billAfterApplyingDiscounts, is(90.25));
	}
}