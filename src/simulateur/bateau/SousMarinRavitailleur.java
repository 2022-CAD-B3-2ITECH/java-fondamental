package simulateur.bateau;

public class SousMarinRavitailleur extends BateauMilitaire implements Submersible, Cargo {

	public static final int PROFONDEUR_FURTIVE = 150;
	private int profondeur;
	private int tonnageDansSoute;

	public SousMarinRavitailleur(String nom) {
		super(nom);
	}

	public int getProfondeur() {
		return profondeur;
	}

	public int getTonnageDansSoute() {
		return tonnageDansSoute;
	}

	@Override
	public void plonge() {
		System.out.println("Chhut, on va se cacher");
		this.profondeur = PROFONDEUR_FURTIVE;
	}

	@Override
	public void faitSurface() {
		System.out.println("On remonte");
		this.profondeur = 0;
	}

	@Override
	public void chargeTonnage(int tonnage) {
		this.tonnageDansSoute += tonnage;
	}

	@Override
	public int dechargeTonnage() {
		int ancienTonnage = this.tonnageDansSoute;
		this.tonnageDansSoute = 0;
		return ancienTonnage;
	}

}
