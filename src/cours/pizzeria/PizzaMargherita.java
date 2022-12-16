package cours.pizzeria;

public class PizzaMargherita extends Pizza {

	public PizzaMargherita() {
		super();
		this.fromage = new Fromage("Mozarella");
		this.pate = new Pate("Pâte fine");
		this.sauce = new Sauce("Sauce tomate");
		this.garniture = new Garniture("");
	}

}
