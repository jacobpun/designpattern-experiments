import org.junit.Test;
import org.punnoose.designpattern.factory.Car;
import org.punnoose.designpattern.factory.CarFactory;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class CarFactoryTest {

	@Test
	public void shouldCreateCars(){
		CarFactory factory = new CarFactory();
		Car car = factory.createCar("Honda");
		assertThat(car.getType(), is("Honda"));
	}
}