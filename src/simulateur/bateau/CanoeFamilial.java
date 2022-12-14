package simulateur.bateau;

public class CanoeFamilial extends Canoe{
	
	private int tailleFamille;
	
	public CanoeFamilial(int tailleFamille) {
		this.tailleFamille = tailleFamille;
		this.nombreRames = tailleFamille + 1;
	}

	public int getTailleFamille() {
		return tailleFamille;
	}

	public void setTailleFamille(int tailleFamille) {
		this.tailleFamille = tailleFamille;
	}

	@Override
	public void navigue() {
		super.navigue();
		System.out.println("Je navigue avec : " + this.tailleFamille + " personnes");
	}
	
	

}
