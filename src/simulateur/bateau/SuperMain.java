package simulateur.bateau;

import static simulateur.bateau.Bateau.*;

import simulateur.bateau.piece.Coque;


public class SuperMain {

	public static void main(String[] args) {
		int utilisationDUnImportStatique = 1000/POIDS_TONNEAU_TONNES;
		
		//Instanciation d'un bateau
		Bateau blackPearl = new Bateau("oh MONDIEU C'EST LE BLACK PEARL!!!");
		Coque coqueBateau1 = new Coque(3000);
		blackPearl.setCoque(coqueBateau1);
		System.out.print("Nombre de bateaux construits : ");
		System.out.println(Bateau.getNombreDeBateauxConstruits());

		//Instanciation d'un autre bateau
		Bateau princeDesMers = new Bateau("Le prince des mers");
		princeDesMers.setCoque(new Coque(200));
		System.out.print("Nombre de bateaux construits : ");
		System.out.println(Bateau.getNombreDeBateauxConstruits());
		
		//Instanciation d'un troisième bateau
		Bateau rascasse = new Bateau("La rascasse frétillante");
		rascasse.setCoque(new Coque(300));
		System.out.print("Nombre de bateaux construits : ");
		System.out.println(Bateau.getNombreDeBateauxConstruits());
		
		blackPearl.arriveAuPort();
		System.out.println(blackPearl.getNom());
		
	}

}
