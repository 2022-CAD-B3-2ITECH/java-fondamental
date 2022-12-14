package simulateur.bateau;

public class BateauCivil extends Bateau {
	
	private int nombrePassager;
	
	public BateauCivil(String nom) {
		super(nom);
		System.out.println("Je sors du chantier");
	}
	
	public BateauCivil(String nom, int nombreDePassagers) {
		this(nom);
		this.nombrePassager = nombreDePassagers;
	}

	public int getNombrePassager() {
		return nombrePassager;
	}

	public void setNombrePassager(int nombrePassager) {
		this.nombrePassager = nombrePassager;
	}
	
}
