package Cartes;

public class PlusOuMoinsModele<T extends CarteClassique> {
	
    private Paquet<T> paquet;
    private int index = 0;
    private int score = 0;
    
    PlusOuMoinsModele(Paquet<T> paquet){
    	this.paquet = paquet;
    }
    

    public T getCarteCourante() {
    	return paquet.get(index);
    }
    
    public T getCarteSuivante() {
    	return paquet.get(index+1);
    }
    
    public boolean verifierChoix(String choix) {
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
    
    public boolean estFini() {
    	return index >= paquet.size() -1;
    }
    public int getScore() {
    	return score;
    }
}