package Cartes;

public enum Couleur {
    CARREAU("Carreau"), PIQUE("Pique"), COEUR("Coeur"), TREFLE("Trèfle");
	
	private final String visuel; // on stocke les arguments de l'énumération 
	
	private Couleur(String visuel) { // Constructeur. En interne java initialise public static final Couleur CARREAU = new Couleur("Carreau");
		this.visuel = visuel; // donc le visuel que renvoyé lorsqu'on appelle par exemple Couleur.CARREAU correspond à la valeur entre parenthèses.
	}

	@Override
	public String toString() { // on renvoie les attributs lors d'un appel de la classe.
		return visuel;
	}
}