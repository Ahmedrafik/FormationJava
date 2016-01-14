package Etudiant;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FichierSession {

	public static void ecrireSession(Session session, String mois)throws IOException{
		
		FileWriter writer = new FileWriter(mois+".txt");
		PrintWriter pwriter = new PrintWriter(writer);
		ArrayList<Note> notes = session.getNotes();
		for(Note notetmp : notes){
			String print = notetmp.getCours().getNom() + "\t" + notetmp.getNote() + "\t" + notetmp.getEtudiant().getNom();
			pwriter.println(print);
		}
		pwriter.close();
	}
	
	public static Session lireSession(String mois)throws IOException{
		FileReader read = new FileReader(mois + ".txt");
		BufferedReader reader = new BufferedReader(read);
		Session session = new Session(mois);
		while(true){
			String line = reader.readLine();
			if(line == null){ 
				break;
			}
			StringTokenizer t =  new StringTokenizer(line, "\t");
			Cour courstmp = new Cour(t.nextToken());
			float noteetu = Float.valueOf(t.nextToken());
			Etudiant etu = new Etudiant(t.nextToken());
			
			Note notetmp = new Note(courstmp, etu, noteetu);
			session.add(notetmp);
		}
		reader.close();
		return session;
	}
	
}
