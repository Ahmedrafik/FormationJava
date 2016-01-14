package test;
import java.util.Vector;

import Etudiant.*;

public class TestEtudiant {

	public static void main(String[] args) {
		/* Création d'étudiant */
		
		Etudiant philip = new Etudiant("Philip", "blond");
		Etudiant david = new Etudiant("David", "roux");
		
		/* Test des premières méthodes TP-1 */
		philip.travailler();
		System.out.println("");
		david.seReposer();
		
		/*Création de nouveaux étudiants TP-2 */
		
		Etudiant philip2 = new Etudiant("Philip", "brun");
		Etudiant christophe = new Etudiant("Christophe", "chatain");
		Etudiant philip3 = philip2;
		
		/* Test == & equals */
		
		if(philip == philip2){
			System.out.println("Philip & philip sont des clones !");
		}
		else{
			System.out.println("Philip est un Jedi !");
		}
		if(philip3 == philip2){
			System.out.println("Philip2 & phili3p sont des clones !");
		}
		else{
			System.out.println("Philip2 est un Jedi !");
		}
		
		/* Test avec equals */
		if(philip.equals(philip2)){
			System.out.println("Philip & philip sont des clones !");
		}
		else{
			System.out.println("Philip est un Jedi !");
		}
		if(philip3.equals(philip2)){
			System.out.println("Philip2 & phili3p sont des clones !");
		}
		else{
			System.out.println("Philip2 est un Jedi !");
		}
		
		/* test estBlond() méthode static */
		
		if(Etudiant.estBlond(philip)){
			System.out.println(philip.getNom() + " est blond !");
		}
		else{
			System.out.println(philip.getNom() + " n'est pas blond !");
		}
		
		if(Etudiant.estBlond(david)){
			System.out.println(david.getNom() + " est blond !");
		}
		else{
			System.out.println(david.getNom() + " n'est pas blond !");
		}
		
		if(Etudiant.estBlond(christophe)){
			System.out.println(christophe.getNom() + " est blond !");
		}
		else{
			System.out.println(christophe.getNom() + " n'est pas blond !");
		}
		
		/* Test Etudiant boursier */
		
		EtudiantBoursier nathalie = new EtudiantBoursier("Nathalie", 456);
		Etudiant jerome = new EtudiantBoursier("Jérome", 6987);
		
		nathalie.travailler();
		System.out.println("");
		jerome.travailler();
		System.out.println("");
		
		/* Test Interface Eleve */
		
		Vector<Double> notesAlex = new Vector<Double>();
		notesAlex.addElement(15.2);
		notesAlex.addElement(12.1);
		notesAlex.addElement(6.4);
		notesAlex.addElement(4.0);
		notesAlex.addElement(18.2);
		notesAlex.addElement(16.3);
		System.out.println(notesAlex);
		Primaire alex = new Primaire("Alex", "blond", "Cm1", notesAlex);
		Double moyenneAlex = alex.getMoyenne();
		System.out.println("alex a une moyenne de : " + moyenneAlex);
		System.out.println(alex.affiche());

		Vector<Double> notesVanessa = new Vector<Double>();
		notesVanessa.addElement(15.2);
		notesVanessa.addElement(12.1);
		notesVanessa.addElement(6.4);
		notesVanessa.addElement(4.0);
		notesVanessa.addElement(18.2);
		notesVanessa.addElement(16.3);
		Eleve vanessa = new Primaire("Vanessa", "chatain", "Ce2", notesVanessa);
		Double moyenneVanessa = vanessa.getMoyenne();
		System.out.println("Vanessa a une moyenne de : " + moyenneVanessa);
		System.out.println(vanessa.affiche());

		Vector<Double> notesElisa = new Vector<Double>();
		notesElisa.addElement(15.2);
		notesElisa.addElement(10.0);
		notesElisa.addElement(6.4);
		notesElisa.addElement(14.0);
		notesElisa.addElement(0.2);
		notesElisa.addElement(10.3);
		Etudiant elisa= new Etudiant("Elisa", "blond", notesElisa);
		Double moyenneElisa= elisa.getMoyenne();
		System.out.println("Elisa a une moyenne de : " + moyenneElisa);
		System.out.println(elisa.affiche());
		
		Vector<Double> notesBruno = new Vector<Double>();
		notesBruno.addElement(15.2);
		notesBruno.addElement(12.1);
		notesBruno.addElement(6.4);
		notesBruno.addElement(4.0);
		notesBruno.addElement(18.2);
		notesBruno.addElement(16.3);
		Etudiant bruno= new Etudiant("Bruno", "brun", notesBruno);
		Double moyenneBruno = bruno.getMoyenne();
		System.out.println("Bruno a une moyenne de : " + moyenneBruno);
		System.out.println(bruno.affiche());
	
		/* Test enum CouleurYeux */
		
		Etudiant enumetu = new Etudiant("Lilou", "roux", notesBruno, CouleurYeux.vert);
		System.out.println(enumetu.affiche());
		Etudiant enumetu1 = new Etudiant("Lilou", "roux", notesBruno, "bleu");
		System.out.println(enumetu1.affiche());
		Etudiant enumetu2 = new Etudiant("Lilou", "roux", notesBruno, "violet");
		System.out.println(enumetu2.affiche());
	
	}
	
	
}
