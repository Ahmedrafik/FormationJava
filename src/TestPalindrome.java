
public class TestPalindrome {

	public static void main(String[] args) {
		
		String testinv = "aze rt y ";
		String testinvres = Palindrome.inverse(testinv);
		System.out.println(testinv + " => " + testinvres);
		
		if(Palindrome.isPalindrome(testinv)){
			System.out.println(testinv + " est un palindrome !");
		}
		else{
			System.out.println(testinv + " n'est pas un palindrome !");
		}

		String testinv2 = "esope reste ici et se repose";
		if(Palindrome.isPalindrome(testinv2)){
			System.out.println(testinv2 + " est un palindrome !");
		}
		else{
			System.out.println(testinv2 + " n'est pas un palindrome !");
		}
		
	}

}
