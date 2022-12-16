/**
 * Exemple sur les tableaux
 */

package cours;

import simulateur.bateau.Bateau;

// Classe principale
public class Tableaux {
	public static void main(String[] args) {
		
		// Declaration d'un tableau sans l'alimenter
		int[] nouveauTableau = new int[3];
		
		// Affectation des valeurs a un tableau
		// Remarque : le premier indice du tableau est 0
		nouveauTableau[1] = 4;
		nouveauTableau[2] = Integer.MAX_VALUE;

		// Affichage d'une valeur d'un tableau
		System.out.println("La dernière valeur de nouveauTableau " + nouveauTableau[2]);

		// Affichage d'une valeur non attribue d'un tableau (cela est egal a null)
		Bateau[] tableauBateaux = new Bateau[5];
		System.out.println("Le tableau à l'index 0 vaut : " + tableauBateaux[0]);

		// Vouloir acceder a un index non inclus dans un tableau genere une exception
//		Bateau bateauNull = tableauBateaux[5];

		// Déclaration d'un tableau sans declarer son nombre d'elements et alimente
		// directement
		Bateau[] tableauBateaux2 = { new Bateau("b1"), new Bateau("b2") };

		// Parcours du tableau pour afficher les elements
		for (int i = 0; i < tableauBateaux2.length; i++) {
			System.out.println("Dans mon tableau, j'ai le bateau " + tableauBateaux2[i]);
		}

		for (Bateau bateau : tableauBateaux2) {
			System.out.println("Dans mon tableau, j'ai le bateau " + bateau);
		}

		// Tableau a deux dimensions
		int[][] tableauADeuxDimensions = new int[4][3];

		// Parcours du tableau pour afficher le contenu.
		for (int i = 0; i < tableauADeuxDimensions.length; i++) {
			int[] colonne = tableauADeuxDimensions[i];
			for (int j = 0; j < colonne.length; j++) {
				colonne[j] = (int)(Math.random() * 10);
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				int valeurDansTableau = tableauADeuxDimensions[i][j];
				System.out.println("Dans le tableau[" + i + "][" + j + "] = " + valeurDansTableau);
			}
		}

	}

}