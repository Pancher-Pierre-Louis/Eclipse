package Cartes;

public class PlusOuMoinsVue <T extends CarteClassique> {
	
	public void afficherWinPlus(T carteCourante, T carteSuivante) {
		System.out.println("Carte acutelle: " + carteCourante.getFace() + "supérieur à " + carteSuivante.getFace());;;
		System.out.println("Bravo 1 point pour toi");
	}
	
	public void afficherWinMoins(T carteCourante, T carteSuivante) {
		System.out.println("Carte acutelle: " + carteCourante.getFace() + "inférieure à " + carteSuivante.getFace());;;
		System.out.println("Bravo 1 point pour toi");
	}
	
	public void afficherLose(T carteCourante, T carteSuivante) {
		System.out.println("Carte acutelle: " + carteCourante.getFace() + " contre " + carteSuivante.getFace());;;
		System.out.println("Perdu, mais continue");
	}
	

}
