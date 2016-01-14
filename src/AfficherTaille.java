
public class AfficherTaille {

	public static void main(String[] args) {
		int taille = Integer.parseInt(args[0]);
		switch(taille){
		case 1 : 
			System.out.println("Petit !");
			break;
		case 2 :
			System.out.println("Moyen !");
			break;	
		default :
			System.out.println("Grand !");
			break;
		}
	}

}
