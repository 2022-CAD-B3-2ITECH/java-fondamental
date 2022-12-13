package cours.aeroport;

/**
 * Classe gérant un avion
 *
 */
public class Avion {
	
	private int carburant;
	private String nom;
	
	//Altitude en mètres
	private float altitude;
	
	/**
	 * Renvoie la consommation de l'avion ....
	 */
	private int consommation() {
		return (int) (3 * altitude);
	}
	
	/**
	 * Fait décoller l'avion : l'altitude augmente
	 */
	public void decolle() {
		altitude = 100;
		carburant -= consommation();
	}
	
	public void atterrit() {
		altitude = 0;
		carburant -= consommation();
	}
	
	public void vole() {
		carburant -= consommation();
	}
	
	public float getAltitude() {
		return altitude;
	}

	public int getCarburant() {
		return carburant;
	}
	
	

}
