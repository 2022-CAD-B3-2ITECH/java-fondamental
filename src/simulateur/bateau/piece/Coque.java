package simulateur.bateau.piece;

/**
 * Coque d'un bateau
 *
 */
public class Coque {
	
	private int pointsDeVieMax;
	private int pointsDeVie;
	
	public Coque(int pointsDeVieMax) {
		this.pointsDeVieMax = pointsDeVieMax;
		this.pointsDeVie = pointsDeVieMax;
	}

	public void subitDegats(int degats) {
		System.out.println("La coque a perdu : " + degats + " point de vie.");
		this.pointsDeVie -= degats;
	}

	public void repare(int reparations) {
		this.pointsDeVie += reparations;
		this.pointsDeVie = Math.min(this.pointsDeVie, this.pointsDeVieMax);
		System.out.println("Après réparations, la coque a " + this.pointsDeVie + " points de vie.");
	}

	public boolean isCoqueDetruite() {
		return this.pointsDeVie <= 0;
	}

	public int getPointsDeVie() {
		return pointsDeVie;
	}

	public int getPointsDeVieMax() {
		return pointsDeVieMax;
	}
	
	
	

}
