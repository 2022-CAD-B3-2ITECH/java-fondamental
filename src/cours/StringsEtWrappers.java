package cours;

import java.util.Scanner;

public class StringsEtWrappers{
	
	
	public static void main(String[] args) {
        
        //Chaîne de caractère
		String maChaineDeCaractères = null;
		String maChaineDeCaractèresNonNull = "Coucou";
		maChaineDeCaractèresNonNull += " les gens";
		
		// Autoboxing
		Integer monEntier = 4;
        
        // Unboxing
		Integer monAutreEntier = Integer.valueOf(4);
		monAutreEntier++;
        
        // Conversion d'une String en classe Float
		Float f = Float.valueOf("3.4");
        
        // Conversion du float en String
		f.toString();
		
        // Saisir au clavier et affecter la saisie a une variable
		Scanner scannerClavier = new Scanner(System.in);
		System.out.println("Veuillez entrer une chaîne de caractères");
		String venantDuClavier = scannerClavier.nextLine();
		System.out.println("La chaine de caractères vaut : " + venantDuClavier);
        
        // Recuperer un double
		System.out.println("Veuillez entrer un float ");
		String doubleAsString = scannerClavier.nextLine();
		System.out.println("La chaine de caractères vaut : " + Double.valueOf(doubleAsString));
		
		
		scannerClavier.close();
	}
}