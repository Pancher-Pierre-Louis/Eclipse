package Cartes;

public abstract class CarteClassique implements ICarte {
	protected String motif; 
	protected boolean isVisible = false;   
	protected abstract String getFace();
	protected final Valeur valeur;
    protected final Couleur couleur;

    public CarteClassique(Valeur valeur, Couleur couleur) { // Constructeur
    	this.valeur = valeur;  
        this.couleur = couleur;    
    }
	// --- Méthode de l'interface ICarte ---
    @Override
	public void tourner() {
		isVisible = ! isVisible;
	}	
    

    @Override
    public boolean estSuperieureOuEgale(ICarte carte) {
        boolean rep = false;
        try {
            CarteClassique c = (CarteClassique) carte;
            rep = this.valeur.ordinal() >= c.valeur.ordinal();
        } catch (ClassCastException e) {
            System.out.println("TODO DEBUG : problème de cast , ICarte comparée n'est pas une Carte 52");
        }

        return rep;
    }
    
    // --- Getters et Setters  ---
    public String getMotif() {
        return motif;
    }
    
    public void setMotif(String motif) {
        this.motif = motif;
    }

    public boolean getIsVisible() {
        return isVisible;
    }
    
	@Override
	public String toString() { // Si la carte est visible on renvoie sa couleur et sa valeur, à définir dans les classes filles)
		String rep;
		if (!isVisible) {
			rep=motif;
		}
		else {
			rep=this.getFace();
		}
		return rep;
	}
    

	
}
