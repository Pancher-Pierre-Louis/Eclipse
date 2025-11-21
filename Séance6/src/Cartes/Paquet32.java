package Cartes;

public class Paquet32 extends Paquet<Carte32>{
	
	private static Paquet32 instance32;
	
    public static Paquet32 getInstance() { // Permet de créer une instance unique de l'objet pour le singleton
        if (instance32 == null) {
            instance32 = new Paquet32(); 
        }
        return instance32;
    }
    
    public Paquet32(){}
	
	@Override
	protected void creerPaquet() {	// méthode pour remplir le paquet avec des cartes 
        	for (Valeur valeur : Valeur.values()) {
        		if (valeur.getPuissance() >= Valeur.SEPT.getPuissance()) { 
        			for (Couleur couleur : Couleur.values()) { 
        				super.cartes.add(new Carte32(valeur, couleur)); 
        			}
        		}
        	}
	}
}
