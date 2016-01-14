package Etudiant;

public class EtudiantBoursier extends Etudiant implements Eleve{

	private int montantBourse;
	
	public EtudiantBoursier(String nom, String couleur, int bourse){
		super(nom, couleur);
		this.montantBourse = bourse;
	}
		
	public EtudiantBoursier(String nom, int bourse){
		this(nom, null, bourse);
	}
	
	public int getBourse(){
		return montantBourse;
	}
	
	
	public void travailler(){
		super.travailler();
		System.out.print(" avec une bourse de " + this.montantBourse);
	}
	
	public boolean equals(Object etu){
		if((etu.getClass()).isAssignableFrom(Etudiant.class)){
			return super.equals((Etudiant)etu);
		}
		else{
			if((etu.getClass()).isAssignableFrom(EtudiantBoursier.class)){
				return (super.equals(etu) && (Math.abs(this.montantBourse - ((EtudiantBoursier)etu).getBourse()) <= 10));
			}
			else{
				return false;
			}
		}
	}

}
