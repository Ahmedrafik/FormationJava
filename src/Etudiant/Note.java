package Etudiant;

public class Note implements Comparable{

	private Cour cours;
	private Etudiant etudiant;
	private float note;
	
	public Note(Cour cours, Etudiant etu, float note){
		this.cours = cours;
		this.etudiant = etu;
		this.note = note;
	}
	
	public Note(){
		this(new Cour(), new Etudiant("inconnu"), 10);
	}
	
	public Cour getCours(){
		return this.cours;
	}
	
	public float getNote(){
		return this.note;
	}
	
	public Etudiant getEtudiant(){
		return etudiant;
	}
	
	public String toString(){
		return this.etudiant.getNom() + " a eu la note de " + this.note + " au cour " + this.cours.getNom() + ".\n";
	}

	@Override
	public int compareTo(Object o) {
		if (this.note > ((Note) o).getNote()) {
			return 1;
		} else if (this.note == ((Note) o).getNote()) {
			return 0;
		} else {
			return -1;
		}
	}
	
	public boolean equals(Object note){
		if((note.getClass()).isAssignableFrom(Note.class)){
			if(this == note || (this.cours == ((Note)note).cours && this.etudiant == ((Note)note).etudiant) && this.compareTo(note) == 0){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}
}
