
public class Util {
	
	public static void affiche(int[] tab){
		for(int elt : tab){
			System.out.print(elt + " ");
		}
		System.out.println("");
	}
	
	public static void raz(int [] tab){
		for(int i = 0 ; i < tab.length ; i++){
			tab[i] = 0;
		}
	}
	
}
