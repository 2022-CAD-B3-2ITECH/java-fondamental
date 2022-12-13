package simulateur.bateau;

public class Bateau {
	
	private static int nombreDeBateauxConstruits;
	
	private String nom;
	private double miles;
	
	public Bateau(String nom) {
		this.nom = nom;
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

}
