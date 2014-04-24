import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AtheleteFactoryTest {

	@Test
	public void shouldCretaeOneGoldWinner() {
		AthleteFactory factory = new AthleteFactory();

		Athlete athlete = factory.createAthlete("GoldWinner", "GoldWinner");
		assertThat(athlete.getWinnerType(), is("Gold Winner"));
	}

	@Test
	public void shouldNotCreateTwoGoldWinners() {
		AthleteFactory factory = new AthleteFactory();
		
		Athlete athlete1 = factory.createAthlete("GoldWinner", "GoldWinner");
		assertThat(athlete1.getWinnerType(), is("Gold Winner"));
		
		Athlete athlete2 = factory.createAthlete("GoldWinner", "GoldWinner2");
		assertThat(athlete2.getName(), is("GoldWinner"));
	}
	
}