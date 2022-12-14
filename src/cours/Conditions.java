package cours;

import simulateur.bateau.Bateau;

// Classe principale
public class Conditions {
	public static void main(String[] args) {
		short forceElephant = 1;
		short forceRhinoceros = 12;

		// if then else
		if (forceElephant > forceRhinoceros) {
			System.out.println("L'éléphant est le plus fort");
		} else {
			if (forceElephant == forceRhinoceros) {
				System.out.println("Les deux animaux sont de force égale");
			} else {
				System.out.println("Le rhinocéros est le plus fort");
			}
		}

		// switch
		System.out.println("\r\nSwitch");
		switch (forceElephant) {
		case 1:
			System.out.println("L'éléphant a une force de 1");
			System.out.println("Il n'est pas très fort");
			break;
		case 2:
			System.out.println("L'éléphant a une force de 2");
			System.out.println("Il n'est pas vraiment fort");
			break;
		default:
			System.out.println("Je ne sais pas quelle force a l'éléphant");
		}

		// switch case avec blocs (plus besoin de break)
		System.out.println("\r\nSwitch avec blocs");
		switch (forceElephant) {
		case 1 -> {
			System.out.println("L'éléphant a une force de 1");
			System.out.println("Il n'est pas très fort");
		}
		default -> {
			System.out.println("Je ne sais pas quelle force a l'éléphant");
		}
		}

		System.out.println("\r\nSwitch avec yield");
		// Switch case dont le résultat est stocké dans une variable avec yield
		Bateau bateau1 = null;
		Bateau bateau = switch (forceElephant) {
		case 1 -> {
			yield new Bateau("l'éléphant est pas très fort.");
		}
		case 2 -> {
			yield new Bateau("l'éléphant est ltrès fort ");
		}
		default -> {
			yield new Bateau("Qu'est ce que c'est que ces noms de bateaux ?");
		}
		};
		bateau.getNom();
		

		System.out.println("\r\nConditions ternaires");
		// Condition ternaire
		String messageAAfficher = forceElephant > forceRhinoceros ? "elephant plus fort" : "rhino plus fort";

		// Condition ternaire composée
		String messageAAfficher2 = forceElephant > forceRhinoceros 
					? "elephant plus fort" : forceElephant == forceRhinoceros 
						? "forces égales": "rhino plus fort";

	}
}