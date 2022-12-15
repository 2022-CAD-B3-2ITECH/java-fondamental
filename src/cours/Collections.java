package cours;

import java.util.ArrayList;
import java.util.List;

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
		
	}

}
