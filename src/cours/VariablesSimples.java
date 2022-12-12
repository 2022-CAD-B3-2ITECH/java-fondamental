/**
 * Exemple sur les variables
 */

package cours;

// Classe principale
public class VariablesSimples {
	public static void main(String[] args) {
		// Définition d'un int
		int monInt;

		// Assignation d'une valeur à l'int précédemment vu
		monInt = 98_989;

		// Définition et assignation en une ligne
		int monInt2 = 987;

		// Idem pour un float et un booléen
		float monFloat = 5.8f;
		boolean monBoolean = true;

		// Affectation multiple
		int a, b, c = b = a =  3;

		// Operateur arithmetique simple avec définition
		int d = c * b;
		
		int e = d;
		System.out.println(e);
		System.out.println(d);
		
		
		//Utilisation de parenthèses pour changer l'odre d'exécution
		//des opérations
		e = 3 * (4 + 3);

		//Opération arithmétique sur la même variable
		e += 3;
		e -= 12;
		e*=4;
		
		// Operateur unitaire postfixe
		a++;

		// Operateur unitaire prefixe
		--b;

		// Operateur binaire et
		// Operateur de comparaison logique
		boolean estCeVrai = 3 != 4;
		boolean estCeVraimentVrai = (3 < 4) && (4 < 5);

		// Operateur de negation
		boolean pasVrai = !estCeVraimentVrai;

		// L'opérateur ternaire
		boolean isTrue = true;
		int valeurC = isTrue ? 1 : 0;

	}
}