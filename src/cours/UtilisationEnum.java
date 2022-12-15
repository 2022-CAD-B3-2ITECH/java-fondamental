package cours;

public class UtilisationEnum {

	public static void main(String[] args) {
		StatutEntreprise monStatut = StatutEntreprise.EN_PAUSE;
		
		for (StatutEntreprise statut  : StatutEntreprise.values()) {
			System.out.println(statut);
		}
		
		System.out.println(StatutEntreprise.valueOf("EN_PAUSE").getValeur());

		System.out.println("\r\n switch avec enum");
		switch(monStatut) {
		case ACTIVE -> {
			System.out.println("active");
		}
		case EN_PAUSE ->{
			System.out.println("en pause");
		}
		case RADIEE ->{
			System.out.println("radiee");
		}
		
		}
		
	}

}
