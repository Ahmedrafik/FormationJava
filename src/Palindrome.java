
public class Palindrome {

	public static String inverse(String chaine){
		String inv = "";
		for(int i = chaine.length()-1 ; i >= 0 ; i--){
			inv += chaine.charAt(i);
		}
		return inv;
	}
	
	
	
	public static boolean isPalindrome(String chaine){
		String chaineSspace = chaine.replaceAll(" ", "");
		String invChaineSspace = Palindrome.inverse(chaine).replaceAll(" ", "");
		System.out.println(chaineSspace + " ==> " + invChaineSspace);
		
		return chaineSspace.equals(invChaineSspace);
	}
}
