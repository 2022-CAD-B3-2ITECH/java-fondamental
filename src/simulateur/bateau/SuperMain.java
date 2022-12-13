package simulateur.bateau;

public class SuperMain {

	public static void main(String[] args) {
		Bateau bateau1 = new Bateau("oh mon bateau");
		bateau1.arriveAuPort();
		System.out.println(bateau1.getNom());
		
	}

}
