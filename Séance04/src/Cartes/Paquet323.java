package Cartes;
import java.util.ArrayList;

public class Paquet323 {
	ArrayList<Carte32> paquet = new ArrayList<>();
	private final int start = Valeur.SEPT.ordinal();
	
	    // 🎬 Constructeur : crée automatiquement toutes les cartes du jeu
	public Paquet323() {
		for (int i = start; i < Valeur.values().length; i++) {
	        Valeur valeur = Valeur.values()[i];      // Parcourt toutes les valeurs possibles
			for (Couleur couleur : Couleur.values()) { // Parcourt toutes les couleurs possibles
				paquet.add(new Carte32(valeur, couleur)); // Crée la carte et l’ajoute au paquet
			}
		}
	}
    public Carte32 getCarte(int index) {
        return paquet.get(index);
    }
}
