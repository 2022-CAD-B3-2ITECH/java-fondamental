package cours.pizzeria;

public abstract class Pizza {
	
	protected Pate pate;
	protected Sauce sauce;
	protected Fromage fromage;
	protected Garniture garniture;
	
	public String toString() {
		return "j'ai le gout de " + pate + " , " + sauce + " , " + garniture + " , " + fromage;
	}

}
