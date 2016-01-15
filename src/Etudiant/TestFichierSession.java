package Etudiant;

import java.io.IOException;

public class TestFichierSession {

	public static void main(String[] args) throws IOException {
		
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
		Session aprilSession = new Session(4);
		Session augustSession = new Session(8);
		Session februarySession = new Session(2);
		Session marchSession = new Session(3);
		Session januarySession = new Session(1);
		
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
		
		marchSession.add(note10);
		marchSession.add(note5);
		marchSession.add(note7);
		marchSession.add(note8);
		
		aprilSession.add(note6);
		aprilSession.add(note3);
		aprilSession.add(note2);
		
		augustSession.add(note7);
		augustSession.add(note9);
		augustSession.add(note1);
		augustSession.add(note6);
		augustSession.add(note4);
		
		februarySession.add(note7);
		februarySession.add(note3);
		februarySession.add(note10);
		
		januarySession.add(note2);
	
		FichierSession.ecrireSession(maySession, "may");
		
		Session session1 = FichierSession.lireSession("may");
		
		System.out.println(session1);
		
		FichierSession.ecrireSession(januarySession, "january");
		FichierSession.ecrireSession(februarySession, "february");
		FichierSession.ecrireSession(marchSession, "march");
		FichierSession.ecrireSession(aprilSession, "april");
		FichierSession.ecrireSession(augustSession, "august");

	}

}
