package Etudiant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Session {

	private int mois;
	private ArrayList<Note> notes;
	private TreeSet<Note> treeNotes;

	public Session(int month) {
		this.mois = month;
		this.notes = new ArrayList<Note>();
		this.treeNotes = new TreeSet<Note>();
	}
	
	public Session(){
		this(0);
	}
	
	public Session(String mois){
		this(0);
		int i = 1;
		for(Mois moistmp : Mois.values()){
			if(moistmp.toString().equals(mois)){
				this.mois = i;
				break;
			}
			i++;
		}	
	}
	
	public ArrayList<Note> getNotes(){
		return this.notes;
	}

	public void add(Note note) {
		this.notes.add(note);
	}
	
	public void addTree(Note note){
		this.treeNotes.add(note);
	}

	
/*	public ArrayList<Etudiant> getSortedList(){
		ArrayList<Note> copyNotes = new ArrayList<Note>(this.notes);
		ArrayList<Etudiant> list = new ArrayList<Etudiant>();
		Iterator<Note> it = copyNotes.iterator();
		Note noteMin = new Note();
		float min = 20.0f;
		Note note;
		Etudiant etuMin = new Etudiant("inconnu");
		while (!copyNotes.isEmpty()) {
			min = 20f;
			while (it.hasNext()) {
				note = it.next();
				if (note.getNote() < min) {
					etuMin = note.getEtudiant();
					noteMin = note;
					min = note.getNote();
				}
			}
			list.add(etuMin);
			copyNotes.remove(noteMin);
		}
		return list;
	}
	*/
	
	public ArrayList<Note> getSortedList2(){
		Collections.sort(this.notes, new Comparator<Note>() {

			@Override
			public int compare(Note o1, Note o2) {
				if(o1.getNote() > o2.getNote()){
					return 1;
				}
				else if(o1.getNote() == o2.getNote()){
					return 0;
				}
				else{
					return -1;
				}
			}
		});	
		return this.notes;
	}
	
	public TreeSet<Note> getsortedTree(){
		return this.treeNotes;
	}
	
	public String toString(){
		String str = "Session de " + this.mois + " : \n";
		for(Note note : this.notes){
			str = str + note;
		}
		return str;
	}

}
