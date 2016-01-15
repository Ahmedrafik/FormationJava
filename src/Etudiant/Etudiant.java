package Etudiant;

import java.util.Vector;

public class Etudiant implements Eleve{
	
	private String nom;
	private String couleur;
	private Vector<Double> notes;
	private CouleurYeux couleuryeux;

	static final String blond = "blond";
	static final String brun = "brun";
	static final String roux = "roux";
	
	public Etudiant(String nom, String couleur, Vector<Double> notes, CouleurYeux couleuryeux){
		this.nom = nom;
		this.couleur = couleur;
		this.couleuryeux = couleuryeux;
		if(notes == null){
			this.notes=null;
		}
		else{
			this.notes = new Vector<Double>();
			for(int i = 0 ; i < notes.size() ; i++){
				this.notes.addElement(notes.elementAt(i));
			}
		}	
	}
	
	public Etudiant(String nom, String couleur, Vector<Double> notes, String couleuryeux){
		this(nom, couleur, notes, (CouleurYeux)null);

		for(CouleurYeux couleurtmp : CouleurYeux.values()){
			if(couleurtmp.toString().equals(couleuryeux)){
				this.couleuryeux = couleurtmp;
				break;
			}
		}
		
		
		
	}
	
	public Etudiant(String nom, String couleur, Vector<Double> notes){
		this(nom, couleur, notes, (CouleurYeux)null);
	}
	
	public Etudiant(String nom){
		this(nom, "calvicie", null, (CouleurYeux)null);
	}
	
	public Etudiant(String nom, String couleur){
		this(nom, couleur, null, (CouleurYeux)null); 
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public String getCouleur(){
		return couleur;
	}
	
	public void setNotes(Vector<Double> notes){
		for(int i = 0 ; i < notes.size() ; i++){
			this.notes.addElement(notes.elementAt(i));
		}
	}
	
	public static boolean estBlond(Etudiant etu){
		if(etu.couleur == blond){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void travailler(){
		System.out.print(this.nom + " se met au travail !");
	}
	
	public void seReposer(){
		System.out.println(this.nom + " se repose !");
	}
	
	public boolean equals(Object etu){
		if((etu.getClass()).isAssignableFrom(Etudiant.class)){
			if(this == etu || (this.nom == ((Etudiant)etu).nom && this.couleur == ((Etudiant)etu).couleur)){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			if((etu.getClass()).isAssignableFrom(EtudiantBoursier.class)){
				return this == etu || (this.nom == ((EtudiantBoursier)etu).getNom() && this.couleur == ((EtudiantBoursier)etu).getCouleur() && ((EtudiantBoursier)etu).getBourse() == 0);
			}
			else return false;
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
		String Eleve = this.nom + " est un étudiant " + this.couleur;
		if(this.couleuryeux != null){
				Eleve += " aux yeux " + this.couleuryeux.toString(); 
		}
		Eleve += " qui a une moyenne de : " + this.getMoyenne();
		return Eleve;
	}
	
	

	
	
}
