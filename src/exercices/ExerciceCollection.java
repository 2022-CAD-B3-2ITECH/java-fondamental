
package exercices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExerciceCollection {

    public static void main(String args[]) {
    	
    	//Initialisation des collections
    	Set<Integer> prix = new HashSet<>();
    	prix.add(120);
    	prix.add(450);
    	prix.add(140);
    	prix.add(456);
    	prix.add(990);
    	
    	List<String> listeMots = new ArrayList<>();
    	listeMots.add("choucroute");
    	listeMots.add("cahier");
    	listeMots.add("ornythorinque");
    	listeMots.add("citronnade");
    	listeMots.add("fi");
    	
    	//Affichage du prix maximum
    	System.out.println("Le prix maximum est: " + Collections.max(prix));

    	//Affichage du prix minimum
    	System.out.println("Le prix maximum est: " + Collections.min(prix));
    	
    	
    	//Affichage de la liste
    	System.out.println("Affichage de la liste");
    	affiche(listeMots);
    	
    	//Inversion de la liste et affichage
    	System.out.println("Inversion de la liste");
    	Collections.reverse(listeMots);
    	affiche(listeMots);
    	
    	//Mélange de la liste et affichage
    	System.out.println("Mélange de la liste");
    	Collections.shuffle(listeMots);
    	affiche(listeMots);
    	
    	//Tri de la liste et affichage
    	System.out.println("Tri de la liste");
    	Collections.sort(listeMots);
    	affiche(listeMots);
        
    }
    
    private static void affiche(Collection<? extends Object> collection) {
    	for(Object obj : collection) {
    		System.out.println(obj);
    	}
    }

   

}
