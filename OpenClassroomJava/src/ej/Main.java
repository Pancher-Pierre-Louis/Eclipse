package ej;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		// Variables
		int num;
		num = 5;
		num = 10;
		String texte = "Hello world";
		int[] tableau = {1,2,3,0,5,6,7};
		int cpt = 0;
		for (int i=0; i<= tableau.length-1;i++) {
			if(tableau[i] == 0) {
				cpt += 1;
			}
		}
		System.out.println("cpt: " + cpt);
		
		// Atelier
		final int immuable = 20;
		System.out.println(num);
		
		int [] tableauEntier = {5,10,15,20};
		System.out.println(tableauEntier[0]);
		
		int [][] matrice = new int[2][3];
		System.out.println(texte);
		
		int somme = Main.addition(1,5);
		System.out.println(somme);
		
		Main.decompte(10);
		Main.affichage("Pierre-Louis");
		Main.etatMeteo("soleil");
		
		String test = Main.categorieFilm("Star Wars");
		System.out.println(test);
		
		Main.langages();
		
	}
		
	public static int addition(final int entier1, final int entier2) {
		return entier1 + entier2;

		}
	
	public static void decompte(int valeur) {
		if (valeur >= 0) {
			System.out.println(valeur);
			decompte(valeur-1);
		}
	}
		
	public static void affichage(String texte) {
		System.out.println("Bonjour " + texte);
	}
	
	public static void etatMeteo(final String meteo) {
		switch (meteo) {
			case "soleil" -> System.out.println("Beau temps");
			case "pluie" -> System.out.println("Mauvais temps");
			default -> System.out.println("Je ne sais pas");
		}
	}
	
	public static String categorieFilm(final String film) {
		var resultat = switch (film) {
			case "Star Wars" -> "SF";
			case "Toy-Story" -> "Dessin animé";
			default -> "Je sais pas";
		};
		return resultat;
	}
	public static void langages() {
	    List<String> nomsDesLangages = Arrays.asList("Java", "PHP", "JavaScript");
	    for (String nomDUnLangage : nomsDesLangages) {
	        System.out.println(nomDUnLangage);
	    }
	}
				
}


