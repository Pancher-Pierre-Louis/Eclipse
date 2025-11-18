package Cartes;

public enum Couleur {
    CARREAU("Carreau"), PIQUE("Pique"), COEUR("Coeur"), TREFLE("Trèfle");
	
	private final String visuel; // on stocke les arguments de l'énumération 
	
	private Couleur(String visuel) { // Constructeur
		this.visuel = visuel;
	}

	@Override
	public String toString() { // on renvoie les arguments lors d'un appel de la classe.
		return visuel;
	}
}