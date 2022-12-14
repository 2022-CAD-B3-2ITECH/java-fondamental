package simulateur.bateau;

/**
 * POJO du Canoe. POJO = Plain Old Java Object
 *
 */
public class Canoe {
	
	protected String nom;
	protected int nombreRames;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNombreRames() {
		return nombreRames;
	}
	public void setNombreRames(int nombreRames) {
		this.nombreRames = nombreRames;
	}
	
	public void navigue() {
		System.out.println(this.nom + " navigue grâce à ses " + this.nombreRames + " rames");
	}
	
}
