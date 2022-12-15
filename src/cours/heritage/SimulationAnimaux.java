package cours.heritage;

/**
 * Simulation d'animaux : utilise le polymorphisme
 * avec des instances de Animal et de Volant.
 *
 */
public class SimulationAnimaux {

	public static void main(String[] args) {
		Herisson herisson1 = new Herisson();
		herisson1.bouge();
		herisson1.getNombreDePattes();
		
		Animal chat = new Chat();
		chat.getNombreDePattes();
		
		ChauveSouris chauveSouris = new ChauveSouris();
		faitVoler(chauveSouris);
		
		chauveSouris.bouge();
		faitVoler(new AvionEnPapier());
		
	
		
	}
	
	public static void faitVoler(Volant volant) {
		volant.vole();
	}

}
