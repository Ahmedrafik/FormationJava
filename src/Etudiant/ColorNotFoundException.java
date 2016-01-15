package Etudiant;

import java.util.ArrayList;

public class ColorNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public ColorNotFoundException(){
		super("La couleur citée n'existe pas !");
	}
	
	public ColorNotFoundException(String color){
		super("La couleur " + color + " n'existe pas !");
	}

}
