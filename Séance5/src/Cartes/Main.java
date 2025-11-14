package Cartes;


public class Main {

	public static void main(String[] args) {
		Carte32 uneCarte = new Carte32(Valeur.AS, Couleur.PIQUE);
		String m = uneCarte.getMotif();   
		String v = uneCarte.getFace();  // 
        System.out.println(m); // 
        System.out.println(v); // 
        
        Paquet32 nouveauPaquet = new Paquet32();
        System.out.println(nouveauPaquet.getCarte(15));
        
	}
	
}	