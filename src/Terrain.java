import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Terrain extends Application {
	private Scene scene;
	private BorderPane root;
	private Joueur joueur;
	
	@Override
	public void start(Stage primaryShow) throws Exception {
		// TODO Auto-generated method stub
		Gestion_Touches clavier = new Gestion_Touches(this);
		
		this.joueur = new Joueur();
		
		this.root = new BorderPane();
		this.root.setBottom(this.joueur.corps());
		BorderPane.setAlignment(this.joueur.corps(), Pos.TOP_CENTER);
		
		
		this.scene = new Scene(this.root, 600, 800);
		this.scene.setOnKeyPressed(clavier);
		primaryShow.setScene(this.scene);
		primaryShow.setTitle("Straight Outta Space (S.O.S)");
		primaryShow.show();
	}
	//Fonctions de mouvement du joueur
	public void mvgauche(){
		this.joueur.mvgauche();
	}
	public void mvdroite(){
		this.joueur.mvdroite();
	}
}
