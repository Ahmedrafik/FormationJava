
public class AfficherFactorielle {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int res = 1;
		for(int i = 1 ; i <= number ; i++){
			res*=i;
		}
		System.out.println("Factorielle(" + number + ") = " + res);
	}

}
