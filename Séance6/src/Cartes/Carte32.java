package Cartes;

public class Carte32 extends CarteClassique {
	
	public Carte32(Valeur valeur, Couleur couleur) { // Constructeur
		super(valeur,couleur);
	}

	@Override
	protected String getFace() {
		return "[" + valeur + " de " + couleur + "]"; // on redéfinit le getFace() de CarteClassique
		
	}
}
