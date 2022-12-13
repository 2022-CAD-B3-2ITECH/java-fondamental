
package exercices;

import java.util.Scanner;

public class ExerciceWrappers {
	public static void main(String[] args) {
		
		//Boxing d'un boolean (true) en Boolean
		Boolean bool = true;
		
		//Création d'un int à partir d'une chaîne de caractères
		int monInt = Integer.valueOf("43");
		
		//Passage de ce int en Integer 
		Integer monIntAsInteger = monInt  + 2;
		
		Scanner scannerClavier = new Scanner(System.in);
		System.out.println("Veuillez entrer une chaîne de caractères");
		String venantDuClavier = scannerClavier.nextLine();
		System.out.println("La chaine de caractères vaut : " + venantDuClavier);
		Integer fromScanner = Integer.valueOf(venantDuClavier);
		fromScanner++;
		scannerClavier.close();
		
		
		//Ici, a == b est false  : Integer.valueOf crée des instances différentes
		Integer a = Integer.valueOf(3_000_000);
		Integer b = Integer.valueOf(3_000_000);
		System.out.println(a == b);

		//Ici a==b est true : Integer.valueOf a renvoyé la même instance puisqu'elle
		//est cachée (comme indiqué par la javadoc de Integer.valueOf(int)
		Integer c = Integer.valueOf(3);
		Integer d = Integer.valueOf(3);
		System.out.println(c == d);	

	}
}