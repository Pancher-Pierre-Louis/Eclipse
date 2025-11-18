package Cartes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public abstract class Paquet<T extends CarteClassique> {
	
	protected ArrayList<T> cartes = new ArrayList<>();
	
	protected abstract void creerPaquet();

	public Paquet() {
		super();
		creerPaquet();
		this.shuffle();
	};
	
	public int size() {
		return cartes.size();
	}
	
	public void add(T carte) { // Pourquoi on met un boolean normalement ici ?
		cartes.add(carte);
	}
	
	public T get(int i) {
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
	
	public void shuffle() {
		Collections.shuffle(cartes);
	}
}
