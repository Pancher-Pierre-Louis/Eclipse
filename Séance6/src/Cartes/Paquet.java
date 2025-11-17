package Cartes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Paquet<T extends CarteClassique> {
	private static Paquet<Carte32> instance32;
	private static Paquet<Carte52> instance52;
	
	private final ArrayList<T> cartes = new ArrayList<>();

	private Paquet() {};
	
    private void ajouterCarte(T carte) {
        cartes.add(carte);
    }

    public T getCarte(int index) {
        return cartes.get(index);
    }

    public int taille() {
        return cartes.size();
    }
    
    public void melanger() {
    	Collections.shuffle(cartes);
    }
    
	public static Paquet<Carte32> creerPaquet32(){
        if (instance32 == null) {
        	Paquet<Carte32> paquet = new Paquet<>(); 
        	for (Valeur valeur : Valeur.values()) {
        		if (valeur.getPuissance() >= Valeur.SEPT.getPuissance()) { 
        			for (Couleur couleur : Couleur.values()) { 
        				paquet.ajouterCarte(new Carte32(valeur, couleur)); 
        			}
        		}
        	}
        	instance32 = paquet;
        }
		return instance32;
	}
	
	public static Paquet<Carte52> creerPaquet52(){
        if (instance52 == null) {
        	Paquet<Carte52> paquet = new Paquet<>(); 
        	for (Valeur valeur : Valeur.values()) {
        		if (valeur.getPuissance() >= Valeur.SEPT.getPuissance()) { 
        			for (Couleur couleur : Couleur.values()) { 
					paquet.ajouterCarte(new Carte52(valeur, couleur)); 
        			}
        		}
        	}
        	instance52 = paquet;
        }
		return instance52;
	}	
	
	public static Paquet getInstance32() {
        return instance32;
    }
	
	public static Paquet getInstance52() {
        return instance52;
    }
}
