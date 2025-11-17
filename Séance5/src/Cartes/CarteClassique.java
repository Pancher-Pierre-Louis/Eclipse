package Cartes;

public abstract class CarteClassique implements ICarte {
	protected String motif; 
	protected boolean isVisible = false;   
	protected abstract String getFace();

    // 🏗️ Constructeur : s'exécute à chaque création d'une carte
    public CarteClassique(String motif) {       
        this.motif = motif;  
        this.isVisible = false;    
    }
	// --- Méthodes de l'interface ICarte ---
    @Override
	public void tourner() {
		isVisible = ! isVisible;
	}	
    
    // --- Getters et Setters (accesseurs) ---
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
	public String toString() {
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
