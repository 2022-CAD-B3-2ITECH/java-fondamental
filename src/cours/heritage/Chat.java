package cours.heritage;

/**
 * Un exemple de classe fille héritant de Animal : doit implémenter
 * toutes les méthodes abstraites de Animal 
 *
 */
public class Chat extends Animal {

	@Override
	public int getNombreDePattes() {
		return 4;
	}

	@Override
	protected void excrete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void ingere() {
		// TODO Auto-generated method stub
		
	}

}
