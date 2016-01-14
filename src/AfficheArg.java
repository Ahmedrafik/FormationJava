
public class AfficheArg {

	public static void main(String[] args) {
		System.out.println("Premier argument : ");

		String arg1 = args[0];
		System.out.println("Bonjour " + arg1);

		System.out.println("Tous les arguments : ");

		for (String arg : args) {
			System.out.println("Bonjour " + arg);
		}

	}

}
