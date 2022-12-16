package simulateur.bateau;

public class Ocean extends Territoire {

	public Ocean() {
		this.nom = "ocean";
	}
	
	@Override
	public void accueille(Bateau bateau) {
		System.out.println("Rien à signaler ici");
	}

}
