package simulateur.bateau;

import simulateur.bateau.piece.Coque;

public class Controleur {

	public static void main(String[] args) {
		Controleur controleur = new Controleur();

		// Instanciation d'un bateau
		Bateau bato = new Bateau("Un bateau classique");
		Coque coqueBateau1 = new Coque(100);
		bato.setCoque(coqueBateau1);

		// Instanciation d'un bateau civil
		BateauCivil charline = new BateauCivil("Charline");
		charline.setCivil(20);
		charline.setCoque(new Coque(200));

		// Instanciation d'un bateau militaire
		BateauMilitaire crustace = new BateauMilitaire("Le crustacé sautilleur");
		crustace.setCoque(new Coque(300));
		
		controleur.controle(bato);
		controleur.controle(charline);
		controleur.controle(crustace);
	}

	private void controle(Bateau bateau) {
		System.out.println("\r\nJe fais naviguer : "+ bateau);
		bateau.prendLaMer();
		bateau.navigue(1200);
		bateau.arriveAuPort();
	}

}
