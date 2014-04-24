import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class Athlete {
	
	private String winnerType;
	private String name;
	
	public Athlete(String winnerType, String name) {
		super();
		this.winnerType = winnerType;
		this.name = name;
	}
	public String getWinnerType() {
		return winnerType;
	}
	public void setWinnerType(String winnerType) {
		this.winnerType = winnerType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class GoldWinner extends Athlete{	
	private static GoldWinner INSTANCE;

	private GoldWinner(String name){
		super("Gold Winner", name);
	}

	public static synchronized GoldWinner cretateInstance(String athleteName){
		if(INSTANCE == null){
			INSTANCE = new GoldWinner(athleteName);
		}
		return INSTANCE;
	}

}

class SilverWinner extends Athlete{	
	private static SilverWinner INSTANCE;

	private SilverWinner(String name){
		super("Silver Winner", name);
	}
	
	public static synchronized SilverWinner cretateInstance(String athleteName){
		if(INSTANCE == null){
			INSTANCE = new SilverWinner(athleteName);
		}
		return INSTANCE;
	}
}

class BronzeWinner extends Athlete{	
	private static BronzeWinner INSTANCE;

	
	private BronzeWinner(String name){
		super("Bronze Winner", name);
	}

	public static synchronized BronzeWinner cretateInstance(String athleteName){
		if(INSTANCE == null){
			INSTANCE = new BronzeWinner(athleteName);
		}
		return INSTANCE;
	}

}

class AthleteFactory{
	
	public AthleteFactory(){
	}
	
	public Athlete createAthlete(String athleteType, String atheleteName){
		Class[] parameterTypes = new Class[]{String.class};
		try {
			Method method = Class.forName(athleteType).getMethod("cretateInstance", parameterTypes);
			return (Athlete)method.invoke(null, new String[]{atheleteName});
		} catch (NoSuchMethodException | InvocationTargetException | IllegalArgumentException | IllegalAccessException | SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
			throw new IllegalArgumentException("Invalid Atlette Type: " + athleteType);
		} 
		
	}
}