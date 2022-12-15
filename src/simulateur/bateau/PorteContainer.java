package simulateur.bateau;

public class PorteContainer extends BateauCivil implements Cargo {

	private int tonnageDansContainers;
	
	public PorteContainer(String nom) {
		super(nom);
	}

	@Override
	public void chargeTonnage(int tonnage) {
		this.tonnageDansContainers += tonnage;

	}

	@Override
	public int dechargeTonnage() {
		int ancienTonnageDansContainers = this.tonnageDansContainers;
		this.tonnageDansContainers = 0;
		return ancienTonnageDansContainers;
	}

}
