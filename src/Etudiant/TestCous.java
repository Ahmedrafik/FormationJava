package Etudiant;

public class TestCous {

	public static void main(String[] args) {
		
		
		String[] tab = {"Thomas","Nicolas","Lola","Lea"};
		Cour cirque = new Cour("Cirque", tab);
		System.out.println(cirque);
		Etudiant albert = new Etudiant("Albert", "vert");
		cirque.add(albert);
		System.out.println(cirque);
		cirque.add("Alfred");
		System.out.println(cirque);
		cirque.remove(albert);
		System.out.println(cirque);
		cirque.remove(new Etudiant("Lola"));
		System.out.println(cirque);
		
		
		

	}

}
