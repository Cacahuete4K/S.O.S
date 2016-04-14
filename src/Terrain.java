import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Terrain extends Application {
	private Scene scene;
	private BorderPane root;
	private Joueur joueur;
	private Animation animation;
	@Override
	public void start(Stage primaryShow) throws Exception {
		// TODO Auto-generated method stub
		animation = new Animation(this);
		Gestion_Touches clavier = new Gestion_Touches(this);
		
		this.joueur = new Joueur();
		this.root = new BorderPane();
		this.root.setTop(this.joueur.vies());
		this.root.setBottom(this.joueur.corps());
		BorderPane.setAlignment(this.joueur.corps(), Pos.TOP_CENTER);
		
		
		this.scene = new Scene(this.root, 600, 800);
		this.scene.setOnKeyPressed(clavier);
		primaryShow.setScene(this.scene);
		primaryShow.setTitle("Straight Outta Space (S.O.S)");
		primaryShow.show();
		animation.start();
		
	}
	//Fonctions de mouvement du joueur
	public void mvgauche(){
		this.joueur.mvgauche();
	}
	public void mvdroite(){
		this.joueur.mvdroite();
	}
	public void tir(){
		ImageView tir = this.joueur.tir();
		this.root.getChildren().add(tir);
		
	}
	public void mvtir(){
	
		for(int n=0; n<this.root.getChildren().size(); n++){
			if(this.root.getChildren().get(n).getClass() == ImageView.class){
				ImageView w = (ImageView) this.root.getChildren().get(n);
				
				if(!w.equals(this.joueur.corps()) /*A RAJOUTER : DIFFERENT D'ALIEN*/){
					ImageView tir = w;
					this.joueur.mvtir(tir);
				}
			}
		}
	}
	public void rmvtir(){
		for(int n=0; n<this.root.getChildren().size(); n++){
			if(this.root.getChildren().get(n).getClass() == ImageView.class){
				ImageView w = (ImageView) this.root.getChildren().get(n);
				
				if(!w.equals(this.joueur.corps()) /*A RAJOUTER : DIFFERENT D'ALIEN*/ && w.getTranslateY()<=0){
					this.root.getChildren().remove(n);
					System.out.println("Supprimé");
				}
			}
		}
	}

	
}


