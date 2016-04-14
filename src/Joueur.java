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
	//Fonctions d'acquisition
	public ImageView corps(){
		return this.corps;
	}
	//Fonctions de mouvement du joueur
	public void mvgauche(){
		if(this.corps.getTranslateX() >= -270)
			this.corps.setTranslateX(this.corps.getTranslateX()-10);
	}
	public void mvdroite(){
		if(this.corps.getTranslateX() <=270)
		this.corps.setTranslateX(this.corps.getTranslateX()+10);
	}

	//Tir
	public ImageView tir(){
		ImageView tir =new ImageView("images/tir.png");
		tir.setTranslateX(this.corps().getTranslateX()+285);
		tir.setTranslateY(this.corps().getTranslateY()+750);
		return tir;	
	}
	public void mvtir(ImageView tir){
		tir.setTranslateY(tir.getTranslateY()-3);
	}
	
}
