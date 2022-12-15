
package exercices;

import java.util.HashSet;
import java.util.Set;

public class ExerciceSet {

    public static void main(String args[]) {
    	//Création d'un Set de Short
        // Ajout d'éléments, dont des doublons
    	Set<Short> shorts = new HashSet<>();        
        shorts.add((short)3); 
        shorts.add((short)4); 
        shorts.add((short)4); 
        shorts.add((short)1);
    	
    	//Affichage de chaque élément du set
        System.out.println("\r\n Affichage de chaque élément du set");
        for (Short short1 : shorts) {
			System.out.println(short1);
		}
    	

        // Affichage de la taille du set
        System.out.println("\r\n le set a la taille : " + shorts.size());
        
        // Vérification que le Set contient bien un élément précédemment inséré
        System.out.println("\r\nLe set contient-il 4 ? " + shorts.contains((short)4));
        
        // Suppression de cet élément
        shorts.remove((short)4);
        
        // Vérification que le Set ne contient plus cet élément
        System.out.println("\r\nAprès suppression, le set contient-il 4 ? " + shorts.contains((short)4));
        
        Object coucou = new Object();
        coucou.hashCode();
    }   

}
