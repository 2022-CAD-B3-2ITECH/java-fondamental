package cours.pizzeria;

public class PizzeriaLuigi implements AbstractPizzeria {
	
	@Override
	public Pizza commandePizzaOrientale(){
		return new PizzaOrientale();
	}
	
	@Override
	public Pizza commandePizzaNordique(){
		return new PizzaNordiqueAllaLuigi();
	}
	
	@Override
	public Pizza commandePizzaMargherita(){
		return new PizzaMargherita();
	}

}
