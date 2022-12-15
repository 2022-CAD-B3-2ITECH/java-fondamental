package cours.heritage;

/**
 * Un avion en papier est tout sauf un animal. Néanmoins, il
 * peut partager l'interface Volant avec ChauveSouris, si l'on
 * veut gérer des instances de Volant dans des méthodes, des classes ...
 *
 */
public class AvionEnPapier implements Volant {

	@Override
	public void vole() {
		System.out.println("Je vole pas longtemps et pas droit");

	}

}
