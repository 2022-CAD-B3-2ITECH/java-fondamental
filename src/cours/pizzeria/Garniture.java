package cours.pizzeria;

public class Garniture {
	
	public final String gout;

	public Garniture(String gout) {
		this.gout = gout;
	}
	
	@Override
	public String toString() {
		return this.gout;
	}
	
}
