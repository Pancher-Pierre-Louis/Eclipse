package Cartes;

class Chat{
    private static int compteur = 0; // commun à tous les chats
    private String nom;              // propre à chaque chat
    private final int compteurChien = 1;

    public Chat(String nom) {
        this.nom = nom;
        compteur++; // chaque nouveau chat fait +1
    }

    public static int getCompteur() {
        return compteur;
    }
public final int getCompteurChien() {
    return compteurChien;
}
}


public class Main4 {
    public static void main(String[] args) {
    	Chat c1 = new Chat("Tigrou");
    	Chat c2 = new Chat("Grisou");

    	System.out.println(c1.getCompteur()); // 👉 2
    	System.out.println(c1.getCompteurChien());
    }
}