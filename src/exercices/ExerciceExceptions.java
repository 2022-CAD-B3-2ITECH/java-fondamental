
package exercices;

// Classe principale
public class ExerciceExceptions {
	public static void main(String[] args) {
		int resultat = 0;
		// Décommenter la ligne ci-dessous et tenter de faire compiler le code
		// en gérant l'exception
		try {
			resultat = calcule(4, 5);
			System.out.println(resultat);
		} catch (CalculException e) {
			e.printStackTrace();
		}
	}

	public static int calcule(int a, int b) throws CalculException {
		throw new CalculException("Une erreur est survenue");
	}

}