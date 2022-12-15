
package exercices;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExerciceMap {

	public static void main(String args[]) {
		// Création d'une Map dictionnaire avec comme type
		// de clé String et comme type de valeur String
		Map<String, String> dictionnaire = new HashMap<>();
		// Ajout des définitions (dont un doublon).
		// La clé est le nom , la valeur est la définition
		dictionnaire.put("ordinateur", "Objet qui traite des informations automatiquement");
		dictionnaire.put("shadow", "Marche bien");
		dictionnaire.put("shadow", "Marche pas top");
		dictionnaire.put("route", "Voie utilisable par les voitures");

		// Affichage de la taille de la map
		System.out.println("Il y a " + dictionnaire.size() + " définitions dans mon dico");

		// Affichage d'une définition d'un mot
		System.out.println("La définition de shadow est : " + dictionnaire.get("shadow"));

		// Affichage de chaque définition avec sa clé et sa valeur
		for (String definition : dictionnaire.values()) {
			System.out.println(definition);
		}

		for (String mot : dictionnaire.keySet()) {
			System.out.println(mot);
		}

		for (Entry<String, String> entry : dictionnaire.entrySet()) {
			System.out.println("La définition de " + entry.getKey() + " est : " + entry.getValue());
		}

		// Suppression d'un élément de la map
		dictionnaire.remove("routes");
		
	}

}
