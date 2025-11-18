package Cartes;

public abstract class CarteClassique implements ICarte {
	protected String motif; 
	protected boolean isVisible = false;   
	protected abstract String getFace();

    public CarteClassique(String motif) { // Constructeur
        this.motif = motif;  
        this.isVisible = false;    
    }
	// --- Méthode de l'interface ICarte ---
    @Override
	public void tourner() {
		isVisible = ! isVisible;
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
