
public class AfficherNombrePremier2 {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		boucle:for(int premier = 2 ; premier <= number ; premier++){
			for(int diviseur = 2 ; diviseur < premier ; diviseur++){
				if(premier % diviseur == 0){
					continue boucle; // permet d'eviter la variable estpremier
				}
			}
			System.out.print(premier + " ");
		}
		System.out.println("");
	}
}
