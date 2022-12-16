package simulateur.bateau;

import simulateur.bateau.piece.Coque;

public class RepairePirates extends Territoire {

	private BateauMilitaire pirate;
	
	public RepairePirates() {
		this.pirate = new BateauMilitaire("Bateau pirate");
		this.pirate.setCoque(new Coque(200));
		this.pirate.setForceCanon(20);
	}
	
	@Override
	public void accueille(Bateau bateau) {
		System.out.println("Vous êtes arrivé dans un repaire de pirates !");
		while(!bateau.getCoque().isCoqueDetruite()
				&& !pirate.getCoque().isCoqueDetruite()) {
			this.pirate.attaque(bateau);			
		}
		if(this.pirate.getCoque().isCoqueDetruite()) {
			System.out.println("Bateau pirate détruit !");
		}
	}

}