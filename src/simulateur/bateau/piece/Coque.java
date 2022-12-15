package simulateur.bateau.piece;

/**
 * Piece d'un bateau
 *
 */
public class Coque {
	
	private int pointsDeVieMax;
	private int pointsDeVie;
	
	public Coque(int pointsDeVieMax) {
		this.pointsDeVieMax = pointsDeVieMax;
		this.pointsDeVie = pointsDeVieMax;
	}

	public int getPointsDeVieMax() {
		return pointsDeVieMax;
	}

	public int getPointsDeVie() {
		return pointsDeVie;
	}
	
	
	

}
