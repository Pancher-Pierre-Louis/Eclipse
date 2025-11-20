package Cartes;

public class PlusOuMoinsControleur <T extends CarteClassique> {

	private PlusOuMoinsVue<T> vue;
	private PlusOuMoinsModele<T> modele;
	
	public PlusOuMoinsControleur(Paquet<T> paquet) {
        this.modele = new PlusOuMoinsModele<>(paquet);
        this.vue = new PlusOuMoinsVue<>();
	}

	public void jouer() {
		while(!modele.estFini()) {
			vue.afficherCarte(modele.getCarteCourante());
			
			String choix = vue.demanderChoix();
			
			boolean resultat = modele.verifierChoix(choix);
			
			vue.afficherResultat(resultat);
			
			vue.afficherScore(modele.getScore());	
		}
	}

	public static void main(String[] args) {
		Paquet32 p = Paquet32.getInstance();
		new PlusOuMoinsControleur<Carte32>(p).jouer();
	}
}