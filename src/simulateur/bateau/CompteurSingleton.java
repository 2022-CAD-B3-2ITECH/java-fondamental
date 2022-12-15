package simulateur.bateau;

/**
 * Un exemple de Singleton : classe dont il n'existe qu'une seule instance.
 * Ici AutreSingleton fournit un compteur. Il est unique pour toute la JVM.
 * Ce compteur fournira donc des valeurs uniques avec getSuivant() dans tout
 * notre programme. Pour ceux qui veulent approfondir le sujet, ce compteur n'est pas
 * ThreadSafe : dans un environnement multithread, ou de programmation concurrente,
 * il pourrait renvoyer deux fois la même valeur pour getSuivant() mais ce n'est pas l'objet
 * de la formation :) ).
 *
 */
public class CompteurSingleton {
	
	private int compteur;
	
	public static final CompteurSingleton INSTANCE = new CompteurSingleton();
	
	private CompteurSingleton() {}
	
	public int getSuivant() {
		return ++compteur;
	}

}
