package simulateur.bateau;

public class Ravitailleur extends BateauMilitaire implements Cargo {

	private int tonnageDansCaisses;
	
	public Ravitailleur(String nom) {
		super(nom);
	}

	@Override
	public void chargeTonnage(int tonnage) {
		this.tonnageDansCaisses += tonnage;

	}

	@Override
	public int dechargeTonnage() {
		int ancienTonnageDansCaisses = this.tonnageDansCaisses;
		this.tonnageDansCaisses = 0;
		return ancienTonnageDansCaisses;
	}

}
