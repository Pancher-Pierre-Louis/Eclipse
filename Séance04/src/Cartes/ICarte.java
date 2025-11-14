package Cartes;

public interface ICarte {
	
    String getNom();   // chaque carte a un nom

    boolean isVisible();
    
    void setVisible(boolean visible);
    

}