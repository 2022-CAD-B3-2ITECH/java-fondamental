package cours;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions {

	public static void main(String[] args) {
		// Appel de methode qui ne marche pas top
		// et utilisation des méthodes de l'exception
		try {
			methodeDeCalcul();
		} catch (MonException e) {
			e.printStackTrace();
		}

		// try catch de lecture de mon fichier
		// try with resources
		File monFichier = new File("mon-fichier.txt");
		try (FileInputStream fileInputStream = new FileInputStream(monFichier)) {
			byte[] fileBytes = fileInputStream.readAllBytes();
		} catch (FileNotFoundException fe) {
			System.out.println("Désolé, le fichier n'existe pas  : " + fe.getMessage());
		} catch (IOException ioe) {
			System.out.println("Erreur d'entrée sortie fichier : " + ioe.getMessage());
		}

	}

	public static void methodeDeCalcul() throws MonException {
		methodeQuiMarchePasTop();
		System.out.println("Le calcul s'est bien passé");
	}

	public static void methodeQuiMarchePasTop() throws MonException {
		throw new MonException("Bon ben là, ça marche pas !", true);
	}

}
