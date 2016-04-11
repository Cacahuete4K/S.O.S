import javafx.scene.image.ImageView;


public class Joueur {
	
	private int vies;
	private ImageView corps;
	
	
	
	public Joueur() {
		this.corps = new ImageView("images/joueur.png");
		this.corps.setFitWidth(37);
        this.corps.setPreserveRatio(true);
		this.vies = 3;
	}
	//Fonctions de mouvement du joueur
	public void mvgauche(){
		this.corps.setTranslateX(this.corps.getTranslateX()-10);
	}
	public void mvdroite(){
		this.corps.setTranslateX(this.corps.getTranslateX()+10);
	}
	public ImageView corps(){
		return this.corps;
		
	}

}
