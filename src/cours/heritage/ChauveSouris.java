package cours.heritage;

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
