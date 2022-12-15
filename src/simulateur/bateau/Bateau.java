package simulateur.bateau;

import simulateur.bateau.piece.Coque;
import simulateur.bateau.piece.Moteur;

/**
 * Un Bateau
 *
 */
public class Bateau {

	private static int nombreDeBateauxConstruits;

	public static int POIDS_TONNEAU_TONNES = 10;

	private final String nom;
	private double miles;
	private Coque coque;
	private Moteur moteur;
	private final int identifiantUnique;

	public Bateau(String nom) {
		nombreDeBateauxConstruits++;
		this.nom = nom;
		this.identifiantUnique = nombreDeBateauxConstruits;
	}

	public static int getNombreDeBateauxConstruits() {
		return nombreDeBateauxConstruits;
	}

	public void prendLaMer() {
		System.out.println("Je prends la mer");
	}

	public void navigue(double milesNavigues) {
		System.out.print("Je navigue sur ");
		System.out.print(milesNavigues);
		System.out.println(" miles");
		this.miles += milesNavigues;
	}

	public void arriveAuPort() {
		System.out.println("Tuut tuut me revoila");
	}

	public double getMiles() {
		return miles;
	}

	public String getNom() {
		return nom;
	}

	public Coque getCoque() {
		return coque;
	}

	public void setCoque(Coque coque) {
		this.coque = coque;
	}

	public Moteur getMoteur() {
		return moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	@Override
	public String toString() {
		return this.nom + "-" + this.identifiantUnique;
	}

	@Override
	public int hashCode() {
		return this.identifiantUnique;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Bateau)) {
			return false;
		}
		Bateau other = (Bateau) obj;
		return this.identifiantUnique == other.identifiantUnique;
	}

}
