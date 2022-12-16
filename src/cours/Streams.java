package cours;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import simulateur.bateau.Bateau;
import simulateur.bateau.EtatBateau;

public class Streams {

	public static void main(String[] args) {

		// Création d'une liste de Bateaux
		List<Bateau> superList = new ArrayList<>();
		Bateau meduse = new Bateau("La Méduse");
		superList.add(new Bateau("L'Hermione"));
		superList.add(new Bateau("La Licorne"));
		superList.add(meduse);

		System.out.println("\r\nAvant le tri");
		for (Bateau bateau : superList) {
			System.out.println(bateau);
		}
		
		// Création d'une classe implémentant Comparator pour trier
		Collections.sort(superList, new BateauNumeroComparator());

		// On peut aussi trier en créant une classe inline
		Collections.sort(superList, new Comparator<Bateau>() {
			@Override
			public int compare(Bateau bateau1, Bateau bateau2) {
				return bateau1.getIdentifiantUnique() - bateau2.getIdentifiantUnique();
			}
		});

		// On peut aussi trier avec une lambda : cette manière et les deux précédentes sont
		// trois manières d'écrire une classe qui implémente Comparator.
		Collections.sort(superList,
				(bateau1, bateau2) -> bateau1.getIdentifiantUnique() - bateau2.getIdentifiantUnique());

		System.out.println("\r\nAprès le tri");

		// Transformation d'une liste en streams

		//Pour afficher
		superList.stream().forEach(bateau -> System.out.println(bateau));
		
		//Pour filtrer puis afficher
		superList.stream().filter(bateau -> bateau.getIdentifiantUnique() > 1)
				.forEach(bateau -> System.out.println(bateau));

		// Tri, filtre, puis affichage
		superList.stream().sorted((b1, b2) -> b1.getIdentifiantUnique() - b2.getIdentifiantUnique())
				.filter(b -> b.etatBateau == EtatBateau.OPERATIONNEL).forEach(bateau -> System.out.println(bateau));

		// Recréation d'une collection filtrée
		List<Bateau> bateauFiltres = superList.parallelStream().filter(b -> b.getIdentifiantUnique() > 1)
				.collect(Collectors.toList());

		//Récupération de n'importe quel élément qui correspond à un Predicate
		System.out.println(superList.parallelStream().anyMatch(b -> b.getNom().equals("La Licorne2")));

	}
}
