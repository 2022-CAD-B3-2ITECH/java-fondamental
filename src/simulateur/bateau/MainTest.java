package simulateur.bateau;

import static simulateur.bateau.Bateau.*;

import simulateur.bateau.piece.Coque;

/**
 * Classe de test : utilisé pour instancier des objets
 * et jouer avec les bateaux
 *
 */
public class MainTest {

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
		
		
		CanoeFamilial canoeFamilial = new CanoeFamilial(4);
		canoeFamilial.setNom("Canoe");
		canoeFamilial.navigue();
		
		BateauCivil bateauCivil = new BateauCivil("Poseidon");
		bateauCivil.navigue(340);
		
		System.out.println("le bateau civil est : " + bateauCivil);
		
		BateauCivil bateauCivil2 = new BateauCivil("Poseidon");
		
		System.out.println("Comparaison d'objets à partir des 'références', avec l'opérateur ==");
		System.out.println(bateauCivil == bateauCivil2);
		
		System.out.println("Comparaison d'objets à partir de règles fonctionnelles , avec la méthode .equals()");
		System.out.println(bateauCivil.equals(bateauCivil2));
		
		
		System.out.println("bateauCivil2 instanceof BateauCivil " +  (bateauCivil2 instanceof BateauCivil));
		System.out.println("bateauCivil2 instanceof Bateau " +  (bateauCivil2 instanceof Bateau));
		System.out.println("bateauCivil2 instanceof Object " +  (bateauCivil2 instanceof Object));
		System.out.println("blackPearl instanceof BateauCivil " +  (blackPearl instanceof BateauCivil));
		
		
		affichageNom(blackPearl);
		affichageNom(bateauCivil2);
		
		afficheHashCode(blackPearl);
		afficheHashCode(new Object());
		afficheHashCode("lkjklj");
		
		Bateau bateau = bateauCivil2;
		System.out.println(bateau.getEtatBateau());
		
	}
	
	public static void affichageNom(Bateau bateau) {
		System.out.println(bateau.getNom());
	}
	
	public static void afficheHashCode(Object object) {
		System.out.println("Le hash de l'objet vaut : " + object.hashCode());
	}

}
