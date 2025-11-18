package Cartes;

import java.util.Scanner;

public class PlusOuMoins<T extends CarteClassique> {
    private final Paquet<T> paquet;
    private int indexCourant;
    private T carteCourante;
    private Scanner sc = new Scanner(System.in);
	private int score = 0;
	private PlusOuMoinsVue <T> vue;
	private PlusOuMoinsControleur controleur;
    
    public PlusOuMoins(Paquet<T> p){
    	this.paquet = p;
        this.indexCourant = 0;
        this.carteCourante = paquet.get(0);
        this.vue = new PlusOuMoinsVue<>(); 
    }

    public void jouer() {
    	while(indexCourant < paquet.size() - 1 ) {
    		System.out.println("Carte actuelle" + carteCourante.getFace());
    		System.out.println("Plus ou Moins ?");
    		String choix = sc.nextLine();
    		
    		T carteSuivante = paquet.get(indexCourant+1);
    		
    		if (carteCourante.estSuperieureOuEgale(carteSuivante) && choix.equals("moins")){
    			vue.afficherWinMoins(carteCourante,carteSuivante);
    			score ++;}
    		else if(!carteCourante.estSuperieureOuEgale(carteSuivante) && choix.equals("plus")){
    			vue.afficherWinPlus(carteCourante,carteSuivante);
    			score++;}
    		else {
    			vue.afficherLose(carteCourante,carteSuivante);
    		}
    		carteCourante = carteSuivante;
    		indexCourant ++;
    	}
    	System.out.println("Ton score : " + score);
    }
}
