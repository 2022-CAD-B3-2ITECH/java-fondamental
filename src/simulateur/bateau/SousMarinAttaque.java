package simulateur.bateau;

public class SousMarinAttaque extends BateauMilitaire implements Submersible {

	public SousMarinAttaque(String nom) {
		super(nom);
	}

	public static final int PROFONDEUR_COMBAT = 100;
	private int profondeur;
	
	@Override
	public void plonge() {
		System.out.println("Fermez les √©coutilles ! On Plonge !!!");
		this.profondeur = PROFONDEUR_COMBAT;

	}

	@Override
	public void faitSurface() {
		System.out.println("On remonte");
		this.profondeur = 0;
	}

}
