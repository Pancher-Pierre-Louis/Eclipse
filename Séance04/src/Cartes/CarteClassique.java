package Cartes;

public abstract class CarteClassique implements ICarte {
	protected Valeur valeur;     // La valeur (As, Roi, Dame, etc.)
	protected Couleur couleur;   // La couleur (Pique, Coeur, etc.)
	protected boolean atout;       // Indique si la carte est un atout
	protected String motif = "rond"; // Le style du dos de la carte
	protected boolean isVisible;   // Si la carte est visible ou face cachée

    // 🏗️ Constructeur : s'exécute à chaque création d'une carte
    public CarteClassique(Valeur valeur, Couleur couleur) {
        this.valeur = valeur;      // Initialise la valeur (ex : As)
        this.couleur = couleur;    // Initialise la couleur (ex : Pique)
        this.atout = false;        // Par défaut, la carte n'est pas un atout
        this.motif = "Classique";  // Motif par défaut
        this.isVisible = false;    // Par défaut, la carte est face cachée
    }
	// --- Méthodes de l'interface ICarte ---
    @Override
    public boolean isVisible() {
        return isVisible;
    }

    @Override
    public void setVisible(boolean visible) {
        this.isVisible = visible;
    }

    @Override
    public String getNom() {
        return valeur + " de " + couleur;
    }
    
    // --- Getters et Setters (accesseurs) ---

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public boolean getAtout() {
        return atout;
    }

    public boolean getIsVisible() {
        return isVisible;
    }

    public Valeur getValeur() {
        return valeur;
    }

    public Couleur getCouleur() {
        return couleur;
    }
    // 🔁 Redéfinition de toString() : appelée automatiquement quand on affiche une carte
    public String toString() {
        return getValeur() + " de " + getCouleur()
               + " (puissance " + getValeur().getPuissance() + ")";
        // Exemple d’affichage : "AS de PIQUE (puissance 14)"
    }
    

	
}
