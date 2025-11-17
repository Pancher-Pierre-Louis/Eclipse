package Cartes;


public class Main {

	public static void main(String[] args) {
		Carte32 uneCarte = new Carte32(Valeur.AS, Couleur.PIQUE);
		String m = uneCarte.getMotif();   
		String v = uneCarte.getFace();  // 

        Paquet<Carte32> nouveauPaquet = Paquet.creerPaquet32();
        Paquet<Carte32> nouveauPaquet2 = Paquet.creerPaquet32();
        
        System.out.println(nouveauPaquet.getCarte(0).getFace());
        System.out.println(nouveauPaquet2.getCarte(1).getFace());
        
        nouveauPaquet.melanger();
        
        System.out.println(nouveauPaquet.getCarte(0).getFace());
        System.out.println(nouveauPaquet2.getCarte(1).getFace());
        
        PlusOuMoins<Carte32> jeuPlusMoins = new PlusOuMoins<>(nouveauPaquet);
        jeuPlusMoins.jouer();
	}
	
}	