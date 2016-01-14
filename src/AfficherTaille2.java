
public class AfficherTaille2 {

	public static void main(String[] args) {
		int taille = Integer.parseInt(args[0]);
		if (taille < 1) {
			System.out.println("Taille invalide");
		} else {
			switch (taille) {
			case 1:
				System.out.println("Petit !");
				break;
			case 2:
				System.out.println("Moyen !");
				break;
			default:
				System.out.println("Grand !");
				break;
			}
		}
	}

}
