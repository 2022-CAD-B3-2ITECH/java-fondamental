package cours.heritage;

/**
 * Classe abstraite, racine de la hiérarchie
 * de classe des animaux. Ne pourra être instanciée
 * avec new, mais peut définir des méthodes abstraites.
 * Une méthode abstraite définit une signature, mais pas
 * de bloc de code (elle doit être implémentée par toute
 * classe 'concrète' qui hérite de la classe abstraite).
 *
 */
public abstract class Animal {
	
	public void bouge() {
		System.out.println("Je me meus, je suis un animal.");
	}
	
	/**
	 * Exemple du Design Pattern patron de méthode : 
	 * Du code est mutualisé ici (un simili algorithme de
	 * digestion). Ce code se base sur des méthodes abstract.
	 * A charge des classes filles d'implémenter ces méthodes
	 * pour modéliser au mieux la digestion des différents
	 * animaux.
	 */
	public void digere() {
		ingere();
		boolean toutVaBien = true;
		if(toutVaBien ) {
			digere();
			excrete();			
		}
		boolean probleme = true;
		if(probleme ) {
			rejetteNourriture();
		}
	}
	
	protected void rejetteNourriture() {
		System.out.println("C'est pas bon, je rejette.");
	}

	protected abstract void excrete();

	protected abstract void ingere();

	public abstract int getNombreDePattes();

}
