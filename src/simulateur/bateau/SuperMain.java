package simulateur.bateau;

public class SuperMain {

	public static void main(String[] args) {
		Bateau bateau1 = new Bateau();
		bateau1.variablePasStatique = 1;
		Bateau.VARIABLE_STATIQUE = 1;
		
		Bateau bateau2 = new Bateau();
		bateau2.variablePasStatique = 2;
		Bateau.VARIABLE_STATIQUE = 2;
		
		System.out.println(bateau1.variablePasStatique);
		System.out.println(bateau1.VARIABLE_STATIQUE);
		
		System.out.println(bateau2.variablePasStatique);
		System.out.println(bateau2.VARIABLE_STATIQUE);

	}

}
