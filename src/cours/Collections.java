package cours;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import simulateur.bateau.Bateau;

public class Collections {

	public static void main(String[] args) {
		//Création d'une liste avec une instance d'ArrayList();
		List<String> listeChaines = new ArrayList<>();
		
		listeChaines.add("Ceci");
		listeChaines.add("est");
		listeChaines.add("une phrase");
		
		listeChaines.add(0, "Hey ! ");
		
		System.out.println("\r\nItération sur une liste avec un index");
		for(int i=0; i< listeChaines.size(); i++) {
			System.out.println(listeChaines.get(i));
		}

		System.out.println("\r\nItération sur une liste avec un foreach");
		for (String string : listeChaines) {
			System.out.println(string);
		}
		listeChaines.remove(1);
		

		System.out.println("\r\nItération après suppression d'un élément");
		for (String string : listeChaines) {
			System.out.println(string);
		}

		//Remplacement d'un élément par un autre
		listeChaines.set(2, "salut");
		
		
		//Set : ajout d'éléments
		Set<String> setChaines = new HashSet<>();
		setChaines.add("Salut");
		setChaines.add("Les gens");
		//Cet élément est déjà présent dans Set : il ne sera pas inséré
		setChaines.add("Salut");
		
		//Boucle avec Iterator et remove
		System.out.println("\r\nJe boucle avec iterator");
		for(Iterator<String> ite = setChaines.iterator();ite.hasNext();) {
			String string = ite.next();
			if(string.equals("Salut")) {
				ite.remove();				
			}
		}
		
		//Boucle avec foreach
		System.out.println("\r\nJe boucle avec foreach");
		for (String string : setChaines) {
			System.out.println("Dans mon set, j'ai " + string);
		}
		
		List<Bateau> mesBateaux = new ArrayList<>();
		mesBateaux.add(new Bateau("Titanic"));
		mesBateaux.add(new Bateau("Le flamboyant"));
		mesBateaux.add(new Bateau("Le shadow des mers"));
		mesBateaux.add(new Bateau("Vtech power"));
		
		System.out.println("\r\nAvant le tri");
		for (Bateau bateau : mesBateaux) {
			System.out.println(bateau);
		}
		
		java.util.Collections.sort(mesBateaux);

		System.out.println("\r\nAvant le tri");
		for (Bateau bateau : mesBateaux) {
			System.out.println(bateau);
		}
		
	}

}
