package Cartes;

public abstract class CarteClassique implements ICarte {
	protected String motif; // Le style du dos de la carte
	protected boolean isVisible = false;   // Si la carte est visible ou face cachée
	
	protected abstract String getFace();

    // 🏗️ Constructeur : s'exécute à chaque création d'une carte
    public CarteClassique(String motif) {       
        this.motif = motif;  // Motif par défaut
        this.isVisible = false;    // Par défaut, la carte est face cachée
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
    // 🔁 Redéfinition de toString() : appelée automatiquement quand on affiche une carte

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
