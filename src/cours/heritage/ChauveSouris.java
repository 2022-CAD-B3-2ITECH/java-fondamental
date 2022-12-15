package cours.heritage;

/**
 * Un exemple de classe fille de Animal,
 * qui implémente deux interfaces. Résultat: 
 * ChauveSouris est un Animal, mais est aussi un Volant
 * et est aussi un ChasseurUltraSon. Elle doit implémenter
 * toutes les méthodes de ces interfaces et classes abstraites.
 *
 */
public class ChauveSouris extends Animal implements Volant, ChasseurUltraSon{

	@Override
	public void vole() {
		System.out.println("Je vole , flap, flap, ça fait peur !");
	}

	@Override
	protected void excrete() {
		
	}

	@Override
	protected void ingere() {
		
	}

	@Override
	public int getNombreDePattes() {
		return 4;
	}

	@Override
	public void repereProie() {
		// TODO Auto-generated method stub
		
	}

}
