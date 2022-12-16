package simulateur.bateau;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import simulateur.bateau.piece.Coque;

public class SimulationBateau {

	public static void main(String[] args) {
		// On crée une grille de jeu
		// Avec des territoires
		// On met dix territoires : 10 pirates, 4 réparations , le reste est vide
		int nombreTerritoires = 21;
		List<Territoire> carte = new ArrayList<>(nombreTerritoires);
		for (int i = 0; i < nombreTerritoires; i++) {
			// On lance un de à six faces ...
			// ... de 1 à 3, on a un repaire de pirates
			// ... de 4 à 5, rien
			// ... pour un 6, on a un port de réparation
			int valeurDe = (int) (Math.random() * 6) + 1;
			switch (valeurDe) {
			case 1:
			case 2:
				carte.add(new RepairePirates());
				break;
			case 3:
			case 4:
			case 5:
				carte.add(new Ocean());
				break;
			case 6:
				carte.add(new PortReparation());
			}
		}

		// On crée le bateau du joueur et on le place sur la grille, sur le territoire
		// central
		BateauMilitaire bateauDuJoueur = new BateauMilitaire("Bateau du joueur");
		bateauDuJoueur.setCoque(new Coque(150));
		bateauDuJoueur.setForceCanon(100);
		int positionJoueur = (nombreTerritoires - 1) / 2;
		bateauDuJoueur.prendLaMer();

		// Boucle de jeu
		try (Scanner scannerClavier = new Scanner(System.in)) {
			while (true) {
				// On attend l'entrée du joueur (un déplacement).
				System.out.println("\r\nVous êtes sur le territoire : " + positionJoueur);
				System.out.println("Il vous reste : " + bateauDuJoueur.getCoque().getPointsDeVie() + " points de vie.");
				System.out.println("Veuillez entrer une commande : ");
				System.out.println("4 pour aller à l'ouest ");
				System.out.println("6 pour aller à l'est ");
				int commande = scannerClavier.nextInt();
				scannerClavier.nextLine();

				// Selon le territoire où il arrive, il se passe quelque chose
				switch (commande) {
				case 4:
					positionJoueur--;
					break;
				case 6:
					positionJoueur++;
					break;
				default:
					System.out.println("Commande incorrecte.");
					continue;
				}

				// On vérifie les conditions finales : bateau détruit ou fin de la carte
				// atteinte
				if (positionJoueur == 0 || positionJoueur == carte.size() - 1) {
					bateauDuJoueur.arriveAuPort();
					System.out.println("Bravo, vous avez gagné !");
					break;
				}
				// On aurait pu faire un else, mais cela alourdit le code
				// Si on est arrivé là, on a réussi un déplacement ET le jeu continue :
				// on cherche le territoire atteint et on le fait accueillir le navire
				bateauDuJoueur.navigue(100);
				Territoire territoireAtteint = carte.get(positionJoueur);
				territoireAtteint.accueille(bateauDuJoueur);

				// On vérifie que le bateau n'a pas coulé
				if (bateauDuJoueur.getCoque().isCoqueDetruite()) {
					System.out.println("Votre coque a été détruite : vous avez perdu.");
					break;
				}
			}
		}

	}

}
