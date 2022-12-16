package cours.pizzeria;

public class PizzaOrientale extends Pizza {

	public PizzaOrientale() {
		super();
		this.fromage = new Fromage("Mozarella");
		this.pate = new Pate("Pâte fine");
		this.sauce = new Sauce("Sauce épicée");
		this.garniture = new Garniture("Oignons, poivrons, merguez");
	}

}
