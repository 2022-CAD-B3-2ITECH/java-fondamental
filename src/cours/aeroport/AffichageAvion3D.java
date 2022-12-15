package cours.aeroport;

/**
 * Classe qui doit afficher un avion (en 3D sisi)
 * A accès à altitude et carburant de l'avion 
 * grâce à des getters, car 
 * ces attributs sont encapsulés.
 *
 */
public class AffichageAvion3D {
	public static void main(String args[]) {
		
		Avion avion1 = new Avion();

		// Je fais voler l'avion
		avion1.decolle();
		avion1.vole();
		avion1.atterrit();
		
		System.out.println("Altitude avion en 3D : ");
		System.out.println(avion1.getAltitude());
		System.out.println("Carburant avion en 3D : ");
		System.out.println(avion1.getCarburant());

	}
}
