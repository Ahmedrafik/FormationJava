package Etudiant;

public class TestCous2 {

	public static void main(String[] args) {
		
		Cour2 cirque = new Cour2("Cirque", "Thomas","Nicolas","Lola","Lea");
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
