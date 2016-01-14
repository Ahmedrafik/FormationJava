
public class AfficherNombre {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int i = 0;
		do{
			System.out.println(" " + i);
		}while(number > i++); //while(number >= ++i);
	}
	
}
