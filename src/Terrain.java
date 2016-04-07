import javafx.application.Application;
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
		this.joueur = new Joueur();
		this.root = new BorderPane();
		this.root.getChildren().add(joueur);
		
		this.root.setBottom(this.joueur);
		

		this.scene = new Scene(this.root, 600, 800);
		primaryShow.setScene(this.scene);
		primaryShow.setTitle("Straight Outta Space (S.O.S)");
		primaryShow.show();
	}

}
