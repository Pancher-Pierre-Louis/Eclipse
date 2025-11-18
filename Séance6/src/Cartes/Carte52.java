package Cartes;

public class Carte52 extends CarteClassique {
	
	private final Valeur valeur;
    private final Couleur couleur;

    public Carte52(Valeur valeur, Couleur couleur) { // Constructeur
        super("****");
        this.valeur = valeur;
        this.couleur = couleur;
    }

    @Override
    public boolean estSuperieureOuEgale(ICarte carte) {
        boolean rep = false;
        try {
            Carte52 c52 = (Carte52) carte;
            rep = this.valeur.ordinal() >= c52.valeur.ordinal();
        } catch (ClassCastException e) {
            System.out.println("TODO DEBUG : problème de cast , ICarte comparée n'est pas une Carte 52");
        }

        return rep;
    }
    
	@Override
	protected String getFace() {
		return "[" + valeur + " de " + couleur + "]"; // on redéfinit le getFace() de CarteClassique
		
	}

}
