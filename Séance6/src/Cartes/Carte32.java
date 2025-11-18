package Cartes;

public class Carte32 extends CarteClassique {
	
	private final Valeur valeur;
	private final Couleur couleur;
	
	public Carte32(Valeur valeur, Couleur couleur) { // Constructeur
		super("****");
		this.valeur = valeur;
		this.couleur = couleur;
	}
	
	@Override
	public boolean estSuperieureOuEgale(ICarte carte) { // Méthode qui renvoie True si la carte de l'objet est supérieure à la carte en argument.
		boolean rep = false;
		try {
			Carte32 c32 = (Carte32) carte;
			rep = this.valeur.ordinal()>=c32.valeur.ordinal();
		} catch (ClassCastException e) {
			System.out.println("TODO DEBUG : problème de cast , ICarte comparée n'est pas une Carte 32");
		}
		
		return rep;
	}

	@Override
	protected String getFace() {
		return "[" + valeur + " de " + couleur + "]"; // on redéfinit le getFace() de CarteClassique
		
	}
}
