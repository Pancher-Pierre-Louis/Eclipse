package Cartes;


public class Main {

	public static void main(String[] args) {
		Carte32 uneCarte = new Carte32(Valeur.AS, Couleur.PIQUE);
		String m = uneCarte.getMotif();   
		String v = uneCarte.getFace();  // 

       Paquet32 p = Paquet32.getInstance();
       p.shuffle();
       
       String maCarte = p.get(0).getFace();
       System.out.println(maCarte);
       
       PlusOuMoins<Carte32> jeuPlusMoins = new PlusOuMoins<>(p);
       jeuPlusMoins.jouer();
        }
}	