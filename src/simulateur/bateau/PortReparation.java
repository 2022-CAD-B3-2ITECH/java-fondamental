package simulateur.bateau;

public class PortReparation extends Territoire {
	
	public static final int MONTANT_REPARATION = 100;

	@Override
	public void accueille(Bateau bateau) {
		bateau.getCoque().repare(MONTANT_REPARATION);
	}

}