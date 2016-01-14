
public class AfficherRemise {

	public static void main(String[] args) {
		int montant = Integer.parseInt(args[0]);
		if(montant<1000){
			System.out.println("La remise est nulle.");
		}
		else if((montant>=1000) && (montant<2000)){
			System.out.println("La remise est de 1%.");
		}
		else if((montant>=2000) && (montant<5000)){
			System.out.println("La remise est de 3%.");
		}
		else{
			System.out.println("La remise est de 5%.");
		}

	}

}
