package exercices;

import java.util.Scanner;

import cours.MaPremiereClasse;

// Classe principale
public class ExerciceConditions {
	public static void main(String[] args) {
		// Récupération de deux variables a et b
//		Scanner scannerClavier = new Scanner(System.in);
//		System.out.println("Veuillez entrer un entier a");
//		int a = scannerClavier.nextInt();
//		scannerClavier.nextLine();
//		System.out.println("Veuillez entrer un entier b");
//		int b = scannerClavier.nextInt();
//		scannerClavier.nextLine();
//		System.out.println("Veuillez entrer un entier c");
//		int c = scannerClavier.nextInt();
//		scannerClavier.nextLine();
//
//		// Chercher le maximum entre a et b (ne faîtes pas ça chez vous, il
//		// y a beaucoup mieux en mode 'Programmation Orientée Objet')
//		// et afficher le résultat
//		System.out.println("Comparaison a et b");
//		if (a > b) {
//			System.out.println("a est le plus grand");
//		} else {
//			if (a == b) {
//				System.out.println("a et b sont égaux");
//			} else {
//				System.out.println("b est le plus grand");
//			}
//		}
//
//		// Chercher le maximum entre a,b et c
//		// et afficher le résultat
//		System.out.println("Comparaison a et b et c");
//		if (a > b) {
//			if (c > a) {
//				System.out.println("c est le plus grand");
//			} else {
//				if (c == a) {
//					System.out.println("a et c sont les plus grands");
//				} else {
//					System.out.println("a est le plus grand");
//				}
//			}
//		} else {
//			if (a == b) {
//				if (c > a) {
//					System.out.println("c est le plus grand");
//				} else {
//					if (c == a) {
//						System.out.println("a et b et c ont la même valeur");
//					} else {
//						System.out.println("a et b sont les plus grands");
//					}
//				}
//			} else {
//				if (c > b) {
//					System.out.println("c est le plus grand");
//				} else {
//					if (c == b) {
//						System.out.println("c et b sont les plus grands");
//					} else {
//						System.out.println("b est le plus grand");
//					}
//				}
//			}
//		}
//
//		// Afficher si a est pair ou impair avec un switch
//		String message = switch (a % 2) {
//		case 0 -> {
//			yield "pair!!!";
//		}
//		default -> {
//			yield "impair!";
//		}
//		};
//
//		System.out.println("a est " + message);
//
//		// Afficher si a est pair ou impair avec une expression ternaire
//		String messageTernaire = a % 2 == 0 ? "pair" : "impair";
//		System.out.println("a est " + messageTernaire);
//
//		// Fermeture des ressources (il y a mieux pour ce faire, mais nous verrons cela
//		// plus tard)
//		scannerClavier.close();
//
//		System.out.println("\r\n Double boucle for (et les trois ours ?)");
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if ((i + j) % 2 == 0) {
//					System.out.println(String.format("(i,j) = (%1$s,%2$s)", i, j));
//				}
//			}
//		}
//
//		System.out.println(calculeSommeArithmetique(4));

		String chaineUtilePourLeCalcul = "coucou";
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		
		chaineUtilePourLeCalcul.length();

	}

	/**
	 * Calcule la somme d'une suite arithmétique de façon récursive
	 * 
	 * @param i
	 * @return
	 */
	private static int calculeSommeArithmetique(int i) {
		if (i == 0) {
			return 0;
		}
		return i + calculeSommeArithmetique(i - 1);
	}
}