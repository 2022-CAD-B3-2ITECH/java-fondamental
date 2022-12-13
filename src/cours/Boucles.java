package cours;

import java.util.Iterator;

// Classe principale
public class Boucles {
	public static void main(String[] args) {
		// Boucle for
		System.out.println("\r\n boucle for");
		for (int i = 0; i < 10; i++) {
			System.out.println("i vaut " + i);
		}

		// Double boucle for
		System.out.println("\r\n Double boucle for (et les trois ours ?)");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(String.format("(i,j) = (%1$s,%2$s)", i,j));
			}
		}

		// Boucle while
		System.out.println("\r\n  while");
		int j = 0;
		while (j < 15) {
			System.out.println("j vaut : " + ++j);
		}

		// Boucle do while
		System.out.println("\r\n  boucle do while");
		int k = 30;
		do {
			System.out.println("k vaut : " + k);
		} while (k < 12);

		// Boucle while avec break 
		System.out.println("\r\n boucle while");
		while (true) {
			double r = 6 * Math.random();
			System.out.println("r vaut " + r);
			break;
		}

	}
}