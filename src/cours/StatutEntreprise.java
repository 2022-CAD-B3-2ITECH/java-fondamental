package cours;

public enum StatutEntreprise {

	ACTIVE(1), RADIEE(2), EN_PAUSE(3);

	private int valeur;

	StatutEntreprise(int valeur) {
		this.valeur = valeur;
	}

	public int getValeur() {
		return valeur;
	}

}