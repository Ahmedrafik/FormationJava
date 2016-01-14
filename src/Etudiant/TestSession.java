package Etudiant;

import java.util.ArrayList;
import java.util.TreeSet;

public class TestSession {

	public static void main(String[] args) {
		
		Etudiant etu1 = new Etudiant("Albert");
		Etudiant etu2 = new Etudiant("Alfred");
		Etudiant etu3 = new Etudiant("Suzanne");
		Etudiant etu4 = new Etudiant("Nicolas");
		Etudiant etu5 = new Etudiant("Gabrielle");
		Etudiant etu6 = new Etudiant("Nathalie");
		Etudiant etu7 = new Etudiant("Lucile");
		Etudiant etu8 = new Etudiant("Judith");
		Etudiant etu9 = new Etudiant("Sarah");
		Etudiant etu10 = new Etudiant("Lea");
		
		String[] listEtu = {etu1.getNom(), etu2.getNom(), etu3.getNom(), etu4.getNom(), etu5.getNom(), etu6.getNom(), 
				etu7.getNom(), etu8.getNom(), etu9.getNom(), etu10.getNom()};
		
		
		Cour tennis = new Cour("Tennis", listEtu);
		
		Note note1 = new Note(tennis, etu1, 12);
		Note note2 = new Note(tennis, etu2, 06);
		Note note3 = new Note(tennis, etu3, 4);
		Note note4 = new Note(tennis, etu4, 18);
		Note note5 = new Note(tennis, etu5, 14);
		Note note6 = new Note(tennis, etu6, 8);
		Note note7 = new Note(tennis, etu7, 10);
		Note note8 = new Note(tennis, etu8, 12);
		Note note9 = new Note(tennis, etu9, 13);
		Note note10 = new Note(tennis, etu10, 19);
		
		Session maySession = new Session(5);
		
		maySession.add(note1);
		maySession.add(note2);
		maySession.add(note3);
		maySession.add(note4);
		maySession.add(note5);
		maySession.add(note6);
		maySession.add(note7);
		maySession.add(note8);
		maySession.add(note9);
		maySession.add(note10);
		
	//	ArrayList<Etudiant> classement1 = maySession.getSortedList();
		//System.out.println(classement1);
		
		ArrayList<Note> classement = maySession.getSortedList2();
		System.out.println(classement);
		
		maySession.addTree(note1);
		maySession.addTree(note2);
		maySession.addTree(note3);
		maySession.addTree(note4);
		maySession.addTree(note5);
		maySession.addTree(note6);
		maySession.addTree(note7);
		maySession.addTree(note8);
		maySession.addTree(note9);
		maySession.addTree(note10);
		
		TreeSet<Note> classement2 = maySession.getsortedTree();
		System.out.println(classement2);
		
		/* Tests de comparaison */
		
		Note note11 = note4;

		
		if(note1 == note3){
			System.out.println("1 & 3 ont la même note !");
		}
		else{
			System.out.println("1 & 3 ont des notes différentes !");
		}
		
		if(note1 == note8){
			System.out.println("1 & 8 ont la même note !");
		}
		else{
			System.out.println("1 & 8 ont des notes différentes !");
		}
		
		if(note3 == note3){
			System.out.println("3 & 3 ont la même note !");
		}
		else{
			System.out.println("3 & 3 ont des notes différentes !");
		}
		
		if(note4 == note11){
			System.out.println("4 & 11 ont la même note !");
		}
		else{
			System.out.println("4 & 11 ont des notes différentes !");
		}

	}

}
