package simulateur.bateau;

/**
 * Un Port charge et décharge des Cargos.
 * Cargo étant une interface, on peut 
 * utiliser un Port avec tout ce qui implémente
 * cette dernière interface.
 *
 */
public class Port {

	private int tonnageCharge = 30;
	private String nom;

	public Port(String nom) {
		this.nom = nom;
	}

	public void charge(Cargo cargo) {
		cargo.chargeTonnage(tonnageCharge);
		System.out.println("%1$s tonnes ont été chargée dans cargo %2$s à %3$s"
				.formatted(tonnageCharge, cargo, this));
	}

	public void decharge(Cargo cargo) {
		int tonnageDecharge = cargo.dechargeTonnage();
		System.out.println(tonnageDecharge + " ont été déchargées de " 
				+ cargo + " à " + this);
	}

	@Override
	public String toString() {
		return this.nom;
	}

	public static void main(String[] args) {
		Port portPekin = new Port("Pékin");
		Port portKuala = new Port("KualaLumpur");
		Port portAmsterdam = new Port("Amsterdam");
		
		Ravitailleur ravitailleur = new Ravitailleur("le ravitailleur");
		
		portPekin.charge(ravitailleur);
		portKuala.charge(ravitailleur);
		portAmsterdam.decharge(ravitailleur);
		portPekin.decharge(ravitailleur);

		Port portLondres = new Port("Londres");
		Port portAthenes = new Port("Athenes");
		
		SousMarinRavitailleur furtif = new SousMarinRavitailleur("furtif");
		
		portLondres.charge(furtif);
		portAthenes.decharge(furtif);

	}

}
