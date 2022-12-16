package cours;

import java.util.Comparator;

import simulateur.bateau.Bateau;

public class BateauNumeroComparator implements Comparator<Bateau> {

	@Override
	public int compare(Bateau bateau1, Bateau bateau2) {
		return bateau1.getIdentifiantUnique() - bateau2.getIdentifiantUnique();
	}

}
