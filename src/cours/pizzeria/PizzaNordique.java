package cours.pizzeria;

public class PizzaNordique extends Pizza {

	public PizzaNordique() {
		super();
		this.fromage = new Fromage("Mozarella");
		this.pate = new Pate("Pâte fine");
		this.sauce = new Sauce("Crème fraîche citronnée");
		this.garniture = new Garniture("Saumon fumé, aneth");
	}

}
