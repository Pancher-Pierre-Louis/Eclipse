package Cartes;

import java.util.Scanner;

public class PlusOuMoins<T extends CarteClassique> {
    private final Paquet<T> paquet;
    private int indexCourant;
    private T carteCourante;
    private Scanner sc = new Scanner(System.in);
	private int score = 0;
	private PlusOuMoinsVue <T> vue;
    
    public PlusOuMoins(Paquet<T> p){
    	this.paquet = p;
        this.indexCourant = 0;
        this.carteCourante = paquet.getCarte(0);
        this.vue = new PlusOuMoinsVue<>(); 
    }

    public void jouer() {
    	while(indexCourant < paquet.taille() - 1 ) {
    		System.out.println("Carte actuelle" + carteCourante.getFace());
    		System.out.println("Plus ou Moins ?");
    		String choix = sc.nextLine();
    		
    		T carteSuivante = paquet.getCarte(indexCourant+1);
    		
    		if (carteCourante.estSuperieureOuEgale(carteSuivante) && choix.equals("moins")){
    			System.out.println("Carte acutelle: " + carteCourante.getFace() + "supérieur à " + carteSuivante.getFace());;;
    			System.out.println("Bravo 1 point pour toi");
    			vue.afficherWinMoins(carteCourante,carteSuivante);
    			score ++;}
    		else if(!carteCourante.estSuperieureOuEgale(carteSuivante) && choix.equals("plus")){
    			System.out.println("Carte acutelle: " + carteCourante.getFace() + "inférieure à " + carteSuivante.getFace());;;
    			System.out.println("Bravo 1 point pour toi");
    			vue.afficherWinPlus(carteCourante,carteSuivante);
    			score++;}
    		else {
    			System.out.println("Carte acutelle: " + carteCourante.getFace() + " contre " + carteSuivante.getFace());;;
    			System.out.println("Perdu, mais continue");
    			vue.afficherLose(carteCourante,carteSuivante);
    		}
    		carteCourante = carteSuivante;
    		indexCourant ++;
    	}
    	System.out.println("Ton score : " + score);
    }
}
