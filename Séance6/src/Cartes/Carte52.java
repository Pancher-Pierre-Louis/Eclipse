package Cartes;

public class Carte52 extends CarteClassique {

    public Carte52(Valeur valeur, Couleur couleur) { // Constructeur
		super(valeur,couleur);
    }
    
	@Override
	protected String getFace() {
		return "[" + valeur + " de " + couleur + "]"; // on redéfinit le getFace() de CarteClassique
		
	}

}
