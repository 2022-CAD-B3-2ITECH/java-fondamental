package simulateur.bateau;

public class BateauMilitaire extends Bateau {
	
	private int forceCanon;

	public BateauMilitaire(String nom) {
		super(nom);
	}

	public int getForceCanon() {
		return forceCanon;
	}

	public void setForceCanon(int forceCanon) {
		this.forceCanon = forceCanon;
	}

	public void attaque(Bateau cible) {
		// this attaque cible
		System.out.println(this + " attaque " + cible);
		cible.getCoque().subitDegats(this.forceCanon);
		if (cible.getCoque().isCoqueDetruite()) {
			return;
		}

		// si cible peut contre attaquer, il le fait
		if (cible instanceof BateauMilitaire) {
			System.out.println(cible + " contre-attaque " + this);
			BateauMilitaire cibleMilitaire = (BateauMilitaire) cible;
			this.getCoque().subitDegats(cibleMilitaire.forceCanon);
		}

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
