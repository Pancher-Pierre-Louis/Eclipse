package Cartes;

public class Paquet32 extends Paquet<Carte32>{
	
	private static Paquet32 instance32;
	
    public static Paquet32 getInstance() {
        if (instance32 == null) {
            instance32 = new Paquet32();
        }
        return instance32;
    }
    
    public Paquet32() {
    	super();
    }
	
	@Override
	protected void creerPaquet() {
        	for (Valeur valeur : Valeur.values()) {
        		if (valeur.getPuissance() >= Valeur.SEPT.getPuissance()) { 
        			for (Couleur couleur : Couleur.values()) { 
        				cartes.add(new Carte32(valeur, couleur)); 
        			}
        		}
        	}
	}
}
