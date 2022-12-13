package exercices;

public class ExerciceChaineDeCaracteres {
	public static void main(String[] args) {
		
		//Définition et déclaration d'une chaîne valant "Hey ?"
		String hey = "Hey ?";
		
		//Définition et déclaration d'une chaîne valant "What's wrong with you ?"
		String whatsWrong = "What's wrong with you ?";
		
		//Affichage de : "Hey ? What's wrong with you ?" dans la console
		System.out.println(hey + " " + whatsWrong);
		
		String formatted = "Hey !!! what's wrong with %1$s ?";
		System.out.println(String.format(formatted, "Zineb", 3, 4));
		System.out.println(String.format(formatted, "Florian"));
		System.out.println(String.format(formatted, "Frank"));
		System.out.println(String.format(formatted, "Hermann"));
		System.out.println(String.format(formatted, "Jérôme"));
		System.out.println(String.format(formatted, "Nicolas"));
		
	}
}