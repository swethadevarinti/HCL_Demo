
public class Singleton {
	
	
	private Singleton() {}
	private static Singleton  instance = null;
	
	public static Singleton reference() {
		
		if(instance == null) {
			instance = 	new Singleton();
		}
	
		return instance;
	}
}
