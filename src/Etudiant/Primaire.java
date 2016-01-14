package Etudiant;

import java.util.Vector;

public class Primaire implements Eleve{
	
	private String nom;
	private String couleur;
	private String classe;
	private Vector<Double> notes;

	public Primaire(String nom, String couleur, String classe, Vector<Double> notes){
		this.nom = nom;
		this.couleur = couleur;
		this.classe = classe;
		if(notes == null){
			this.notes = null;
		}
		else{
			this.notes = new Vector<Double>();
			for(int i = 0 ; i < notes.size() ; i++){
				this.notes.addElement(notes.elementAt(i));
			}
		}
	}
	
	@Override
	public String getNom() {
		return nom;
	}
	
	public void setNotes(Vector<Double> notes){
		for(int i = 0 ; i < notes.size() ; i++){
			this.notes.addElement(notes.elementAt(i));
		}
	}

	@Override
	public Double getMoyenne() {
		Double moy = 0.0;
		for(int i = 0 ; i < this.notes.size() ; i++){
			moy+=this.notes.elementAt(i);
		}
		return moy/this.notes.size();
	}

	@Override
	public String affiche() {
		String Eleve = this.nom + " est un élève de " + classe + " " + this.couleur + " qui a une moyenne de : " + this.getMoyenne();
		return Eleve;
	}

}
