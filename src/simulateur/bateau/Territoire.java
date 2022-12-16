package simulateur.bateau;

public abstract class Territoire {

	protected String nom;
	
	public abstract void accueille(Bateau bateau);

	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return "Territoire [nom=" + nom + "]";
	}
	
}