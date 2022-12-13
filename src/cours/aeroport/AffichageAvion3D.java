package cours.aeroport;

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
