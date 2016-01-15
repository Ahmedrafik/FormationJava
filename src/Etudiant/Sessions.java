package Etudiant;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Sessions {

	public HashMap<String,Collection<Note>> calendrier;
	
	public Sessions(){
		this.calendrier = new HashMap<String,Collection<Note>>();
	}
	
	public void add(String month, Note note){
		if(calendrier.get(month)==null){
			TreeSet<Note> notesMois = new TreeSet<Note>();
			notesMois.add(note);
			calendrier.put(month, notesMois);
		}
		else{
			calendrier.get(month).add(note);
		}
	}
	
	public Collection<String> getMonths(){
		return this.calendrier.keySet();
	}
	
	public Collection<Note> getNotes(String month){
		return this.calendrier.get(month);
	}
	
	public String toString(){
		String res = "";
		Iterator<String> itMonth = this.getMonths().iterator();
		while(itMonth.hasNext()){
			String mois=itMonth.next();
			res += mois + " : ";
			Iterator<Note> itNote = this.calendrier.get(mois).iterator();
			while(itNote.hasNext()){
				Note note = itNote.next();
				res += note.getEtudiant().getNom() + " (" + note.getNote() + ")";
				if(itNote.hasNext()){
					res += ", ";
				}
			}
			res += "\n";
		}
		return res;
	}
	
	public static Sessions getSessionsFromFiles() throws IOException{
		Sessions sessions = new Sessions();
		File currentdir = new File(".");
		File[] paths = currentdir.listFiles();
		for(File path : paths){
			String filename = path.getName();
			if(filename.endsWith(".txt")){
				String mois = filename.substring(0, filename.length()-4);
				FileReader read = new FileReader(filename);
				BufferedReader reader = new BufferedReader(read);
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
					
					sessions.add(mois, notetmp);
					
				}
				reader.close();
			}
		}
		return sessions;
		
	}
	
	
}
