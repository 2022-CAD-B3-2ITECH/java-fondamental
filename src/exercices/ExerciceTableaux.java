/*
* Exercice Tableaux
* 
* 1. Ecrire dans un tableau les valeurs suivantes : 1, 1, 2, 3, 5, 8, 13, 21
* 2. Creer un autre tableau ayant un element de plus que le premier initialiser a 0.
* 3. Afficher les elements du premier tableau.
* 4. Afficher les elements du 2eme tableau.
* 5. Copier les valeurs du premier tableau dans le second et inserer une valeur aribitraire a la 3eme position.
* 6. Afficher le tableau apres l'operation d'insertion.
*/
 
package exercices;

import java.util.Random;

// Classe principale
public class ExerciceTableaux {
    public static void main(String[] args) {
    	
    	//L'instruction ci-dessous génère un float aléatoire de 0 à 100.
    	float randomFloat = new Random().nextFloat() * 100;
    	
    	//Créer un tableau de 10 floats
    	float[] flottes = new float[10];
    	
    	//Le remplir avec des float aléatoires
    	for (int i = 0; i < flottes.length; i++) {
			flottes[i] = new Random().nextFloat() * 100;
		}
    	
    	//Afficher le résultat sur la console
    	for (float f : flottes) {
			System.out.println("Dans le premier tableau, j'ai : " + f);
		}
    	
    	//Créer un nouveau tableau de 12 floats
    	float[] flottes2 = new float[12];
    	
    	//y copier les dix éléments du premier tableau.
    	for (int i = 0; i < flottes.length; i++) {
    		flottes2[i] = flottes[i];
		}
    	
    	//Mettre deux nouveaux float aléatoires dans les deux dernières 'cases'
    	for (int i = flottes.length; i < flottes2.length; i++) {
    		flottes2[i] =  new Random().nextFloat() * 100;
		}
    	
    	//Afficher le nouveau tableau
    	for (float f : flottes2) {
			System.out.println("Dans le deuxième tableau, j'ai : " + f);
		}
    	
    }
    
}