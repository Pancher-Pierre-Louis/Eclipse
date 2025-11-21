package Cartes;
import java.util.ArrayList;
import java.util.Collections;

public abstract class Paquet<T extends CarteClassique> {
	
	protected ArrayList<T> cartes = new ArrayList<>(); // On crée le paquet vide
	
	protected abstract void creerPaquet(); // Méthode à remplir dans la classe fille

	public Paquet() { // Constructeur 
		this.creerPaquet(); 
		this.shuffle();
	}
	
	public int size() {
		return cartes.size(); // Taille du paquet
	}
	
	public void add(T carte) { // Pourquoi on met un boolean normalement ici ? Demander au prof
		cartes.add(carte);
	}
	
	public T get(int i) { // renvoie la carte à l'index i
		T carte = cartes.get(i);
		return carte;
	}
	
	protected String toString(int nbColonnes) { 
		String rep="";
		for (int i = 0; i < 32; i++) {
			T elem = cartes.get(i);
			rep+=elem.toString();
			if (i%nbColonnes==(nbColonnes-1)) {
				rep+="\n";
			}
		}
		return rep;
	}
	
	@Override
	public String toString() { 
		return this.toString(5);
	}
	
	public void shuffle() { // mélange les cartes
		Collections.shuffle(cartes);
	}
}
