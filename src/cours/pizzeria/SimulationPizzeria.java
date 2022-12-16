package cours.pizzeria;

public class SimulationPizzeria {
	
	/**
	 * Ici, on a utilisé le pattern Fabrication, qui définit une
	 * interface (ici AbstractPizzeria) pour la création
	 * d'un objet, mais qui délègue aux classes concrètes
	 * la création des objets. Ces objets sont aussi instanciés
	 * avec une classe, mais déclarés comme étant une interface
	 * ou classe abstraite.
	 * Si l'on veut faire en sorte que les ingrédients soient typés
	 * et différents selon les pizzerias, il vaut mieux utiliser le pattern
	 * Fabrique abstraite, plus complet, mais complexe.
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractPizzeria chezLuigi = new PizzeriaLuigi();
		ClientPizzeria clientPizzeria = new ClientPizzeria();
		
		Pizza pizza1 = chezLuigi.commandePizzaMargherita();
		clientPizzeria.deguste(pizza1);
		
		Pizza pizza2 = chezLuigi.commandePizzaNordique();
		clientPizzeria.deguste(pizza2);
		
		Pizza pizza3 = chezLuigi.commandePizzaOrientale();
		clientPizzeria.deguste(pizza3);
		
		
	}

}
