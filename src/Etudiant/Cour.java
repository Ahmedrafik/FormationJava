package Etudiant;

import java.util.ArrayList;

public class Cour {
	
	private String nom;
	private ArrayList<Etudiant> inscrit;
	
	public Cour(String nom, String[] etudiant){
		this.nom = nom;
		this.inscrit = new ArrayList<Etudiant>();
		if(etudiant != null){
			for(int i = 0 ; i < etudiant.length ; i++){
				this.inscrit.add(new Etudiant(etudiant[i]));
			}
		}
	}
	
	public Cour(String nom){
		this(nom, null);
	}
	
	public Cour(){
		this("inconnu", null);
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public void add(Etudiant etu){
		this.inscrit.add(etu);
	}
	
	public void add(String nomEtu){
		Etudiant etu = new Etudiant(nomEtu);
		this.inscrit.add(etu);
	}
	
	public boolean remove(Etudiant etu){
		return this.inscrit.remove(etu);
	}
	
	public String toString(){
		String res = "Le cours " + this.nom + " contient les étudiant : \n";
		for(Etudiant etu : this.inscrit){
			res = res + etu.getNom() + "\n";  
		}
		return res;
	}
}
