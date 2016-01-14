
public class AfficherNombrePremier {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		for(int premier = 2 ; premier <= number ; premier++){
			boolean estpremier = true;
			for(int diviseur = 2 ; diviseur < premier ; diviseur++){
				if(premier % diviseur == 0){
					estpremier = false; // continue permet d'eviter la variable estpremier
				}
			}
			if(estpremier){
				System.out.print(premier + " ");
			}
		}
		System.out.println("");

	}

}
