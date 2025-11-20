package Cartes;

public class PlusOuMoinsControleur <T extends CarteClassique> {

	private PlusOuMoinsVue<T> vue;
	private PlusOuMoinsModele<T> modele;
	
	public PlusOuMoinsControleur(PlusOuMoinsModele<T> modele,PlusOuMoinsVue<T> vue) {
		this.modele = modele;
		this.vue = vue;
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
	       
	       PlusOuMoinsModele<Carte32> modele = new PlusOuMoinsModele<>(p);
	       PlusOuMoinsVue<Carte32> vue = new PlusOuMoinsVue<Carte32>();
	       
	       PlusOuMoinsControleur<Carte32> controleur = new PlusOuMoinsControleur<Carte32>(modele,vue);
	       controleur.jouer();
	}
}