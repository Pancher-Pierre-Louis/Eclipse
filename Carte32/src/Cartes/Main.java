package Cartes;
import java.util.ArrayList;

enum Valeur32{
	sept,huit,neuf,dix,V,D,R,As;
}

enum Couleur{
	pique,trefle,coeur,carreau;
}

class Cartes32{
	private Valeur32 valeur; //Attribut
	private Couleur couleur;//Attribut
	private boolean atout;//Attribut
	private String motif;//Attribut
	private boolean faceVisible;//Attribut
	
	public Cartes32(Valeur32 valeur,Couleur couleur) { // CONSTRUCTEUR (s'execute automatiquement avec new Cartes32
        this.valeur = valeur;
        this.couleur = couleur;
        this.atout = false;
        this.motif = "Classique";
        this.faceVisible = false;
	}

	public Valeur32 getValeur() {
		return valeur;
	}
	
	public Couleur getCouleur() {
		return couleur;
	}
	
	public boolean isVisible() {
		return faceVisible;
	}
	public void setFaceVisible(boolean faceVisible) {
		this.faceVisible = faceVisible;
	}
		public void setMotif(String motif) {
			this.motif = motif;
		}
}


class Paquet{
	private ArrayList<Cartes32> cartes = new ArrayList<>();
	
	public Paquet() {
		for (Couleur c: Couleur.values()) {
			for (Valeur32 v: Valeur32.values()) {
				cartes.add(new Cartes32(v, c));
			}
		}
	}
    public void afficher() {
        for (Cartes32 carte : cartes) {
            System.out.println(carte.getValeur() + " de " + carte.getCouleur());
        }
    }
}

public class Main {
	public static void main(String[] args) {
		Paquet p = new Paquet();
        p.afficher();
	}	

}