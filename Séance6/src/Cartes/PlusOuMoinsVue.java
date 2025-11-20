package Cartes;
import java.util.Scanner;


public class PlusOuMoinsVue <T extends CarteClassique> {
	
	private final Scanner sc = new Scanner(System.in);
	
    public void afficherCarte(T carte) {
    	System.out.println("Carte actuelle" + carte.getFace());
    }
    
    public void afficherResultat(boolean ok) {
    	if (ok) {
    		System.out.println("Bravo tu gagnes 1 point ! " );
    	}
    	else {
    		System.out.println("Raté... ");
    	}
    	
    }
    
    public void afficherScore(int score) {
    	System.out.println("Ton score: " + score);
    }
    
    public String demanderChoix() {
    	System.out.println("Plus ou Moins ?");
    	return sc.nextLine();
    }
    
}
