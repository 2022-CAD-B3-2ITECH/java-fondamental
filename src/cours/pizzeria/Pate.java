package cours.pizzeria;

public class Pate {

	public final String gout;

	public Pate(String gout) {
		this.gout = gout;
	}
	
	@Override
	public String toString() {
		return this.gout;
	}

}
