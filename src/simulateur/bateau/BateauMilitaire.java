package simulateur.bateau;

public class BateauMilitaire extends Bateau {
	
	int forceCanon;

	public BateauMilitaire(String nom) {
		super(nom);
	}

	public int getForceCanon() {
		return forceCanon;
	}

	public void setForceCanon(int forceCanon) {
		this.forceCanon = forceCanon;
	}
	
	public void attaque(Bateau autreBateau) {
		
	}
	
	
	@Override
	public void prendLaMer() {
		super.prendLaMer();
		System.out.println("Je vais attaquer des bateaux");
	}

	@Override
	public void navigue(double milesNavigues) {
		super.navigue(milesNavigues);
		System.out.println("Je suis à l'affut.");
	}

	@Override
	public void arriveAuPort() {
		super.arriveAuPort();
		System.out.println("Je rentre bredouille");
	}

}
