
package exercices;

public class ExerciceVariables {
	public static void main(String[] args) {
		//Pour chaque variable, afficher sa valeur avec System.out.println();
		// Définition et assignation d'un double (nombre à virgule)
		double d = 3.14;
		System.out.println(d);

		//Post incrémentation de d
		System.out.println(d++);
		System.out.println(d);

		// Création d'une variable contenant un booléen, initialisé à true.
		boolean monBoolean = true;
		
		//Affichage du contraire de sa valeur.
		System.out.println(!monBoolean);

		// Création en une ligne de trois variables de type int, avec la valeur 4
		int a,b,c = b = a = 4;

		// Affichage de la somme de ces trois variables
		System.out.println(a+b+c);

		//Création de trois variables (var1,var2,var3) valant 3, 4 et 5
		int var1 = 3;
		int var2 = 4;
		int var3 = 5;
		
		//Afficher le résultat (booléen) de la comparaison suivante :  var1 < var2 et var2 < var3
		System.out.println(var1 < var2 && var2 < var3);

		//Afficher le résultat (booléen) de la comparaison suivante :  var1 différent de var2 et var2 différent de var3
		System.out.println(var1 != var2 && var2 != var3);
		
		//Un petit opérateur ternaire pour finir ? Si la première variable définie
		// dans ce fichier est inférieure ou égale à la dernière
		// (de type entier) , afficher "ok" sinon afficher "ko"
		System.out.println(d <= var3 ? "ok":"ko");

	}
}