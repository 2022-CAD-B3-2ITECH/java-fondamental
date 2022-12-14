package cours.heritage;

public abstract class Animal {
	
	public void bouge() {
		System.out.println("Je me meus, je suis un animal.");
	}
	
	/**
	 * Exemple du Design Pattern patron de méthode.
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
