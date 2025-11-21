package Cartes;

public class PlusOuMoinsModele<T extends CarteClassique> {
	
    private Paquet<T> paquet;
    private int index = 0;
    private int score = 0;
    
    PlusOuMoinsModele(Paquet<T> paquet){
    	this.paquet = paquet;
    }
    

    public T getCarteCourante() { // Retourne la carte actuelle
    	return paquet.get(index);
    }
    
    public T getCarteSuivante() { // Retourne la carte suivante
    	return paquet.get(index+1);
    }
    
    public boolean verifierChoix(String choix) { // Renvoie True si les conditions sont respectées et incrémente pour avancer dans le jeu
    	T actuelle = getCarteCourante();
    	T suivante = getCarteSuivante();
    	boolean reponse;
    	
    	reponse = choix.equals("plus") &&  suivante.estSuperieureOuEgale(actuelle) || 
    		choix.equals("moins") &&  actuelle.estSuperieureOuEgale(suivante) ;
    	
    	if(reponse) {
    		score++;
    	}
    	
    	index++;
    	
    	return reponse;
    		
    }
    
    public boolean estFini() { // Booléen pour indiquer qu'on arrive au bout du paquet
    	return index >= paquet.size() -1;
    }
    public int getScore() { // Retourne le score
    	return score;
    }
}