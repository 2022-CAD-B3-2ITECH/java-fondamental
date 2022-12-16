package cours.pizzeria;

public class PizzaNordiqueAllaLuigi extends Pizza {

	public PizzaNordiqueAllaLuigi() {
		super();
		this.fromage = new Fromage("Mozarella");
		this.pate = new Pate("Pâte fine");
		this.sauce = new Sauce("Crème fraîche citronnée avec vodka");
		this.garniture = new Garniture("Saumon fumé");
	}

}
