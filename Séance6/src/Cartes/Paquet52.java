package Cartes;

public class Paquet52 extends Paquet<Carte52>{
	
	private static Paquet52 instance52;
	
    public static Paquet52 getInstance() {
        if (instance52 == null) {
            instance52 = new Paquet52();
        }
        return instance52;
    }
    
    public Paquet52() {
    	super();
    }
	
	@Override
	protected void creerPaquet() {
        	for (Valeur valeur : Valeur.values()) {
        		if (valeur.getPuissance() >= Valeur.SEPT.getPuissance()) { 
        			for (Couleur couleur : Couleur.values()) { 
        				cartes.add(new Carte52(valeur, couleur)); 
        			}
        		}
        	}
	}
}

