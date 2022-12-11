package cours;

import java.util.Comparator;

/**
 * Compare deux chaînes de caractères par leur longueur
 *
 */
public class InverseStringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return - o1.compareTo(o2);
	}

}
