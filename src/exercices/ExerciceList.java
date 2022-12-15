package exercices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExerciceList {

	public static void main(String args[]) {
		// Déclaration d'une liste de Integer
		List<Integer> liste = new ArrayList<>();
		// Ajout d'éléments
		liste.add(4);
		liste.add(23);

		// Ajout d'élément à un index donné
		liste.add(2,34);

		// Afficher la taille de la liste
		System.out.println("La taille de la liste vaut : " + liste.size());

		// Affichage de la liste (parcours de chaque élément)
		System.out.println("\r\nAffichage de la liste");
		for (Integer integer : liste) {
			System.out.println(integer);
		}

		// Suppression d'un élément à un certain index
		System.out.println("Suppression de l'objet à l'index 0");
		liste.remove(0);

		// Affichage de la liste (parcours de chaque élément)
		System.out.println("\r\nAffichage de la liste");
		for (Integer integer : liste) {
			System.out.println(integer);
		}
		
		//Derriere l'arraylist : [1][2][3][5]
		//Derriere une linkedList (a)<->(b)<->(c)....

	}

}
