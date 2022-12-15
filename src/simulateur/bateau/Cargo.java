package simulateur.bateau;

/**
 * Décrit un cargo (objet qui peut charger et décharger un tonnage).
 *
 */
public interface Cargo {
	
	void chargeTonnage(int tonnage);
	
	int dechargeTonnage();

}
