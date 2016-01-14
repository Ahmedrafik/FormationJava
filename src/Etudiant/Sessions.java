package Etudiant;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
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
	
	
}
