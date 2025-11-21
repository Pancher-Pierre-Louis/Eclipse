package Cartes;
import java.util.Scanner;


public class PlusOuMoinsVue <T extends CarteClassique> {
	
	private final Scanner sc = new Scanner(System.in); // Permet de demander un input à l'utilisateur
	
    public void afficherCarte(T carte) { // Print la carte en input
    	System.out.println("Carte actuelle" + carte.getFace());
    }
    
    public void afficherResultat(boolean ok) { // Affiche le résultat du tour
    	if (ok) {
    		System.out.println("Bravo tu gagnes 1 point ! " );
    	}
    	else {
    		System.out.println("Raté... ");
    	}
    	
    }
    
    public void afficherScore(int score) { // Affiche le score
    	System.out.println("Ton score: " + score);
    }
    
    public String demanderChoix() { // Demander à l'utilisateur son choix
    	System.out.println("Plus ou Moins ?");
    	return sc.nextLine();
    }
    
}
