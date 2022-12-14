package simulateur.bateau;

public class BateauCivil extends Bateau {
	
	private int civil;
	
	public BateauCivil(String nom) {
		super(nom);
		System.out.println("Je sors du chantier");
	}
	
	public BateauCivil(String nom, int civil) {
		this(nom);
		this.civil = civil;
	}

	public int getCivil() {
		return civil;
	}

	public void setCivil(int civil) {
		this.civil = civil;
	}

	@Override
	public void prendLaMer() {
		super.prendLaMer();
		System.out.println("J'ai " + this.civil + " à bord.");
	}

	@Override
	public void navigue(double milesNavigues) {
		super.navigue(milesNavigues);
		System.out.println("J'ai " + this.civil + " malades.");
	}

	@Override
	public void arriveAuPort() {
		super.arriveAuPort();
		System.out.println("Mes " + this.civil + " sont ravis.");
	}
	
	
	
}
