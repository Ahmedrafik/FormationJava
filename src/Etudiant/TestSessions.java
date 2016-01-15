package Etudiant;

import java.io.IOException;

public class TestSessions {

	public static void main(String[] args) throws IOException {

		Sessions annee = new Sessions();
		
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
		
		annee.add("May", note1);
		annee.add("May", note2);
		annee.add("May", note6);
		annee.add("May", note7);
		annee.add("May", note10);
		annee.add("June", note3);
		annee.add("June", note1);
		annee.add("June", note7);
		annee.add("June", note6);
		annee.add("June", note4);
		annee.add("June", note3);
		annee.add("September", note10);
		annee.add("September", note6);
		annee.add("September", note3);
		annee.add("September", note8);
		annee.add("September", note9);
		annee.add("September", note4);
		annee.add("September", note2);
		annee.add("September", note5);		
		
		System.out.println(annee);
		
		Sessions sessions2016 = Sessions.getSessionsFromFiles();
		System.out.println(sessions2016);
		
		String s = "gZmeAa";
		String s1 = s.substring(0, 2);
		System.out.println(s1);
	}

}
