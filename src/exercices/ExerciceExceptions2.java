
package exercices;

import java.util.Scanner;

// Classe principale
public class ExerciceExceptions2 {

	public static void main(String[] args) {
		try {
			System.out.println("Le résultat est : " + recuperationDonneesEtLanceCalcul());
		}catch(Exception e) {
			System.out.println("Une erreur est survenue  : " + e);
			e.printStackTrace();
		}
	}

	public static int recuperationDonneesEtLanceCalcul() {
		// Récupération de deux variables a et b
		try (Scanner scannerClavier = new Scanner(System.in)) {
			System.out.println("Veuillez entrer un entier a");
			int a = scannerClavier.nextInt();
			scannerClavier.nextLine();
			System.out.println("Veuillez entrer un entier b");
			int b = scannerClavier.nextInt();
			scannerClavier.nextLine();
			int resultat = lanceCalcul(a, b);

			// Les ressources (Scanner) sont fermées grâce au Try With Resources
			return resultat;
		}
	}

	public static int lanceCalcul(int a, int b) {
		return lanceCalculPourDeVrai(a, b);
	}

	public static int lanceCalculPourDeVrai(int a, int b) {
		// Appeler ici prepareCalcul() et trouver un moyen de gérer au mieux
		// le problème
		prepareCalcul();
		return a + b;
	}

	public static void prepareCalcul() throws CalculException {
		throw new CalculException("La préparation du calcul a échoué");
	}

}